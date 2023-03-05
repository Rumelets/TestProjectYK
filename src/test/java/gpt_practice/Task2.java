package gpt_practice;
import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя строку и проверяет, является ли эта строка палиндромом (то есть, можно ли ее прочитать одинаково слева направо и справа налево). Программа должна выводить на экран сообщение "Это палиндром" или "Это не палиндром", в зависимости от того, является ли введенная строка палиндромом.

Пример работы программы:

Введите строку: "А роза упала на лапу Азора"
Результат: Это палиндром

Введите строку: "Яблоко"
Результат: Это не палиндром
 */

public class Task2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(!s.equals("Выйти")){
            System.out.println("Введите пожалуйста строку для проверки является ли она палиндромом.");
            s = sc.nextLine();
            if(!s.equals("Выйти")){
                isPalindrome(s);
            }
        }
        sc.close();
    }
    public static void isPalindrome(String s){
        String sWOspaces = s.replaceAll("[^A-Za-zА-Яа-я0-9]","");
        String sReverted = new StringBuilder(sWOspaces).reverse().toString();
        boolean isPalindrome;
        isPalindrome = sWOspaces.equalsIgnoreCase(sReverted);
        if(isPalindrome){
            System.out.println("Строка является палиндромом");
        }else{
            System.out.println("Строка не явялется палндромом");
        }
    }
}
