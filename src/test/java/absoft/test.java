package absoft;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        System.out.println("Enter quantity of products you want to enter");
        int choice = sc.nextInt();
        for(int i = 0;i<choice;i++) {
            products.add(new Product(i, input.name(), input.qty(), input.price()));
        }
        System.out.println("# | Name | Quantity | Total price");
        for (int i = 0;i<choice;i++){
            System.out.println(products.get(i).number+" | "+products.get(i).name+" | "+products.get(i).price*products.get(i).qty);
        }
    }
}