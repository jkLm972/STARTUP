package fr.efrei.repository;

import fr.efrei.domain.Contact;
import java.util.List;

public interface IContactRepository extends IRepository<Contact, String>{

    public List<Contact> getAll();

}
