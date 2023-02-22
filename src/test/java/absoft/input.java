package absoft;
import java.util.Scanner;

public class input {
    static int qty;
    static float price;

    public static String name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of the product");
        return sc.nextLine();
    }
    public static int qty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity of the product");
        qty = sc.nextInt();
            while (qty <= 0) {
                System.out.println("Quantity cannot be less than 1");
                qty = sc.nextInt();
            }
        return qty;
    }
    public static float price(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter price of the product");
        price = sc.nextFloat();
            while (price<=0) {
                System.out.println("Price cannot be less than 1");
                price = sc.nextFloat();
            }
        return price;
    }
}