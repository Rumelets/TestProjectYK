package gpt_practice;
import static java.lang.Integer.parseInt;
import java.util.Random;
import java.util.Scanner;

/*
Напишите программу на Java, которая создает массив целых чисел заданной длины и заполняет его случайными числами от 1 до 100.
Затем программа должна находить минимальное и максимальное число в массиве и выводить их на экран.
Также программа должна находить среднее арифметическое всех чисел в массиве и выводить его на экран.
Пример вывода программы:
Сгенерированный массив: [63, 27, 42, 78, 91, 14, 54, 86, 1, 56]
Минимальное число: 1
Максимальное число: 91
Среднее арифметическое: 50.2

 */

public class Task3 {
    public static int[] random (int i){
        int min = 1;
        int max = 100;
        int[] randomArray = new int[i];
        Random random = new Random();
        for(int x = 0;x<i;x++){
            randomArray[x]=random.nextInt(max-min)+min;
        }
        return randomArray;
    }
    public static int minValue(int[] i){
        int minValue = Integer.MAX_VALUE;
        for (int j : i) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }
    public static int maxValue(int[] i){
        int maxValue = Integer.MIN_VALUE;
        for (int j:i){
            if(j>maxValue){
                maxValue=j;
            }
        }
        return maxValue;
    }
    public static double approx(int[] i){
        int sum = 0;
        for(int j:i){
            sum+=j;
        }
        return (double) sum/i.length;
    }
    public static void main(String[] args){
        System.out.println("Введите количество чисел для генерации");
        Scanner sc = new Scanner(System.in);
        int i = parseInt(sc.nextLine());
        int[] randomArray = random(i);
        for(int j: randomArray){
            System.out.printf("%s, ",j);
        }
        System.out.println();
        System.out.printf("Минимальное число: %s",minValue(randomArray));
        System.out.println();
        System.out.printf("Максимальное число: %s",maxValue(randomArray));
        System.out.println();
        System.out.printf("Среднее арифметическое: %s",approx(randomArray));
    }
}
