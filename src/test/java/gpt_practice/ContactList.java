package gpt_practice;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    //Обьявление массива контакта
    private final List<Contact> contacts;
    public ContactList(){
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    public void removeContact(Contact contact){
        this.contacts.remove(contact);
    }

    public List<Contact> getAllContacts(){
        return this.contacts;
    }
}
