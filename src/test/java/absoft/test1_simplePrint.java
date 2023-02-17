package absoft;
import java.util.Scanner;

/*
Напишите программу в которой пользователь должен ввести с клавиатуры name и age

Выведите на экран 2 строки:
Hello (name)
Your age is (age)
 */

public class test1_simplePrint {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
        }
    }


