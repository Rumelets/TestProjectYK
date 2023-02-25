package gpt_practice;
import java.util.Scanner;
import static gpt_practice.Inputs.*;

public class Menu {
    public static void main(String [] args){
        ContactList contactList = new ContactList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice != 3){
            System.out.println("Выберите действие:");
            System.out.println("1 - добавить новый контакт");
            System.out.println("2 - Посмотреть список контактов");
            System.out.println("3 - Для выхода");
            choice = sc.nextInt();
        switch (choice){
            case 1:
                Contact contact = new Contact(firstname(), lastname(), email(), number());
                contactList.addContact(contact);
                System.out.println("Контакт добавлен");
                break;
            case 2:
                System.out.println("Список контактов:");
                System.out.println("Имя | Фамилия | Email | Номер");
                for (Contact contact1 : contactList.getContacts()) {
                    System.out.println(contact1.getFirstname() + " " + contact1.getLastname() + " | " + contact1.getEmail() + " | " + contact1.getNumber());
                }
        }
        }
    }
}
