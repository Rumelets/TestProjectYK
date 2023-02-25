package absoft;
/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в следующем виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */


public class test9_array {
    static int[] array = new int[10];
    static int y = 0;
    public static void main(String [] args){
        for(int x = 1;x<=10;x++){
            array[y]=x;
            y++;
        }
        for(int f =0;f<=9;f++) {
            if(f==9) {
                System.out.print(array[f]+"]");
            }else if(f==0) {
                System.out.print("["+array[f]+", ");
            }else{
                System.out.print(array[f]+", ");
            }
        }
    }

}
