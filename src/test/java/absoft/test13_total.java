package absoft;

import static absoft.test13_input.name;
import static absoft.test13_input.qty;
import static absoft.test13_input.price;

public class test13_total {
    public static void total(){
        String[] result = new String[5];
        int n =1;
        for(int x=0;x<5;x++) {
            String name = name();
            int qty = qty();
            float price = price();
            float total = price * qty;
            result[x] = n+". "+name + " | " + total;
            n++;
        }
        for(int y = 0; y<=4;y++) {
            System.out.println(result[y]);
        }
    }
}
