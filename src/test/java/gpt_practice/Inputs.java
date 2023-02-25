package gpt_practice;

import java.util.Scanner;

public class Inputs {
    static Scanner sc = new Scanner(System.in);
    public static String firstname() {
        System.out.println("Введите имя контакта");
        return sc.nextLine();
    }
    public static String lastname() {
            System.out.println("Введите фамилию контакта");
            return sc.nextLine();
    }
    public static String email() {
            System.out.println("Введите email адресс контакта");
            String email = sc.nextLine();
            while (!email.contains("@") || !email.contains(".")) {
                System.out.println("Email должен содержать @ и .");
                email = sc.nextLine();
            }
            return email;
    }
    public static long number(){
        System.out.println("Введите номер контакта");
        String numberStr = sc.nextLine();
        while (!numberStr.matches("\\d+")) {
            System.out.println("Номер должен содержать только цифры");
            numberStr = sc.nextLine();
        }
        return Long.parseLong(numberStr);
    }
}
