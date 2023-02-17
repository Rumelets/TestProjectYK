package absoft;
/*
Написать программу которая будет выводить цифры от 1 до 10 используя цикл while
Когда цифра будет равна 2 или 6 или 10 - вывести сообщение ("[число] - some cool text")
 */

public class test7_while {
    public static void main (String [] args){
        int x = 1;
        while(x<=10){

            if(x==2||x==6||x==10){
               System.out.println(x+" - some cool text");
               x++;
            }else{
            System.out.println(x);
            x++;
            }
        }
    }

}
