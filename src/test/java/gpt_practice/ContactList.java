package gpt_practice;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}