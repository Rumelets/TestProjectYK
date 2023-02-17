package absoft;
import java.util.Scanner;

/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */

public class test11_methods1 {
    public static float total(int qty, float price){
        return price*qty*0.8f;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity");
        int x = sc.nextInt();
        System.out.println("Enter price");
        float y = sc.nextFloat();
        System.out.println("Your total = "+total(x,y));
    }

}