package fr.efrei.factory;
import fr.efrei.domain.Contact;
import fr.efrei.util.Helper;
import java.util.*;
public class ContactFactory {

    public static Contact creatContact(String phone, String email, int homeNumber){
        if (Helper.isNullOrEmpty(phone) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(String.valueOf(homeNumber)))  {
            return null;
        }
        Contact contact = new Contact.Builder()
                .setEmail(email)
                .setPhone(phone)
                .setHomeNumber(homeNumber)

                .build();
        return contact;
    }

    public static Contact creatContact(String phone){
        if (Helper.isNullOrEmpty(phone)){
            return null;
        }
        Contact contact = new Contact.Builder()
                .setPhone(phone)
                .build();
        return contact;
    }

    public static Contact creatContact(String phone, String email){
        if (Helper.isNullOrEmpty(phone) || Helper.isNullOrEmpty(email) )  {
            return null;
        }
        Contact contact = new Contact.Builder()
                .setEmail(email)
                .setPhone(phone)
                .build();
        return contact;
    }

}