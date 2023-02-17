package absoft;
import java.util.Scanner;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

public class test5_Operators_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if(day==1){
            System.out.println("понедельник");
        }else if(day==2){
            System.out.println("вторник");
        }else if(day==3){
            System.out.println("среда");
        }else if(day==4){
            System.out.println("четверг");
        }else if(day==5){
            System.out.println("пятница");
        }else if(day==6){
            System.out.println("суббота");
        }else if(day==7){
            System.out.println("воскресенье");
        }else{
            System.out.println("Ошибка, введите число от 1 до 7");
        }
    }

}
