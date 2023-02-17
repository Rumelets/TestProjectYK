package absoft;

/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class test12_methods2 {
    public static String name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        if(name.equals("Alex")||name.equals("John")||name.equals("Stan")){
            System.out.println("Hello "+name);
        }else{
            System.out.println("Sorry, name was not found");
        }
        return name;
    }
    public static void seat(String name){
        if(name.equals("Alex")||name.equals("John")||name.equals("Stan")) {
            switch (name) {
                case "Alex":
                    System.out.println("Your seat is " + 1);
                    break;
                case "John":
                    System.out.println("Your seat is " + 2);
                    break;
                case "Stan":
                    System.out.println("Your seat is " + 3);
                    break;
            }
        }else{
            return;
        }
    }
    public static void main(String [] args){
        seat(name());
    }

}
