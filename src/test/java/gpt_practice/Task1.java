package gpt_practice;

/*
Напишите программу, которая принимает от пользователя два числа, а затем выводит на экран все числа от меньшего числа до большего числа.

Пример работы программы:

Введите первое число: 3
Введите второе число: 9
Результат:
3
4
5
6
7
8
9
 */


import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пожайлуста два числа:");
        int x = parseInt(sc.nextLine());
        int y = parseInt(sc.nextLine());
        sc.close();
        for(int i = x;i<=y;i++){
            System.out.println(i);
        }
    }
}
