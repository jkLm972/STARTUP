package fr.efrei.repository;

import fr.efrei.domain.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IContactRepository{
    private static ContactRepository repository = null;
    private List<Contact> contactDB = null;

    private ContactRepository() {
        contactDB = new ArrayList<Contact>();
    }


    public static ContactRepository getRepository() {
        if (repository == null){
            return new ContactRepository();
        }
        return repository;
    }

    @Override
    public Contact create(Contact contact) {
        boolean success = contactDB.add(contact);
        if (success){
            return contact;
        }
        else {
            return null;
        }
    }

    @Override
    public Contact read(String s) {
        for (Contact r : contactDB){
            if (r.getPhone().equals(s)){
                return r;
            }

        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        Contact oldContact = read(contact.getPhone());
        if (contact != null){
            contactDB.remove(oldContact);
            contactDB.add(contact);
            return contact;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Contact contactToDelete = read(s);
        if (contactToDelete == null) {
            return false;
        }
        contactDB.remove(contactToDelete);
        return true;
    }

    @Override
    public List<Contact> getAll() {
        return contactDB;
    }
}