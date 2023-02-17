package absoft;
import java.util.Scanner;

public class test13_input {
    public static String name (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of product");
        return sc.nextLine();
    }
    public static int qty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity of product");
        int qty = sc.nextInt();
        if(qty<=0){
            System.out.println("Quantity cannot be equal or less than 0");
            System.exit(1);
            return 0;
        }else{
            return qty;
        }
    }
    public static float price() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of product");
        float price = sc.nextFloat();
        if(price<=0){
            System.out.println("Price cannot be equal or less than 0");
            System.exit(1);
            return 0;
        }else{
            return price;
        }
    }
}