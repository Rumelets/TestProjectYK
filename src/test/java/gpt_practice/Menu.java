package gpt_practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import static gpt_practice.Inputs.*;
import static java.lang.Long.parseLong;

public class Menu {
    public static void main(String [] args){
        ContactList contactList = new ContactList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice != 6){
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить новый контакт");
            System.out.println("2 - Посмотреть список контактов");
            System.out.println("3 - Для удаления контакта по номеру");
            System.out.println("4 - Для экспорта контактов в файл");
            System.out.println("5 - Для импорта контактов из файла");
            System.out.println("6 - Для выхода");
            choice = sc.nextInt();
        switch (choice){
            case 1:
                Contact contact = new Contact(firstname(), lastname(), email(), number());
                System.out.println(contact);
                contactList.addContact(contact);
                System.out.println("Контакт добавлен");
                break;
            case 2:
                System.out.println("Список контактов:");
                System.out.println("Имя | Фамилия | Email | Номер");
                for (Contact contact1 : contactList.getAllContacts()) {
                    System.out.println(contact1.getFirstname() + " " + contact1.getLastname() + " | " + contact1.getEmail() + " | " + contact1.getNumber());
                }
                break;
            case 3:
                System.out.println("Укажите номер контакта который вы хотите удалить");
                int num = sc.nextInt();
                Contact contact2 = null;
                boolean isDeleted = false;
                for (Contact contact1 : contactList.getAllContacts()) {
                    if (contact1.getNumber()==num) {
                        contact2 = contact1;
                        isDeleted = true;
                        System.out.println("Контакт с номером " + num + " удален");
                    }else{
                        System.out.println("Номер контакта не найден");
                    }
                }
                if(isDeleted) {
                    contactList.removeContact(contact2);
                }
                break;
            case 4:
                try{
                    Formatter exportFile = new Formatter("/Users/dmitriy.rumelets/Downloads/ContactList.txt");
                    exportFile.format("%s %s %s %s %s %s %s %s", "Имя"," | ","Фамилия"," | ","Email"," | ","Номер","\r\n");
                    for (Contact contact1 : contactList.getAllContacts()) {
                        exportFile.format("%s %s %s %s %s %s %s %s", contact1.getFirstname() , " | " , contact1.getLastname() , " | " , contact1.getEmail() , " | " , contact1.getNumber(),"\r\n");
                    }
                    System.out.println("Файл ContactList.txt сохранен в папку /Users/dmitriy.rumelets/Downloads");
                    exportFile.close();
                }catch(Exception e){
                    System.out.println("Error creating the file");
                }
                break;
            case 5:
                try{
                    File readContactList = new File("/Users/dmitriy.rumelets/Downloads/ContactList.txt");
                    Scanner readFile = new Scanner(readContactList);
                    // пропускаем первую строку, которая содержит заголовки столбцов
                    if (readFile.hasNextLine()) {
                        readFile.nextLine();
                    }
                    while(readFile.hasNextLine()) {
                        String line = readFile.nextLine();
                        String[] fields = line.split(" \\| ");

                        String firstName = fields[0].trim();
                        String lastName = fields[1].trim();
                        String email = fields[2].trim();
                        long number = parseLong(fields[3].trim());

                        Contact contact1 = new Contact(firstName, lastName, email, number);
                        contactList.addContact(contact1);
                    }
                    readFile.close();
                    System.out.println("Файл бы успешно импортирован");
                    System.out.println("Имя | Фамилия | Email | Номер");
                    for (Contact contact1 : contactList.getAllContacts()) {
                        System.out.println(contact1.getFirstname() + " " + contact1.getLastname() + " | " + contact1.getEmail() + " | " + contact1.getNumber());
                    }
                }catch(FileNotFoundException e){
                    System.out.println("File not found");
                }
                break;
        }
        }
    }
}