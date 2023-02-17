package absoft;
import java.util.Scanner;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */

public class test2_SumOfElements {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Fill in quantity");
    int qty = sc.nextInt();
    System.out.println("Fill in price per each");
    double price = sc.nextDouble();
    double total = qty*price;

    System.out.println("Total: "+total);
    }
}