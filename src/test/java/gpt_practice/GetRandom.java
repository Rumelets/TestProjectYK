package gpt_practice;

import java.util.Random;
import java.util.Scanner;

public class GetRandom {
    static int minValue = Integer.MAX_VALUE;
    static int maxValue = Integer.MIN_VALUE;
    public static int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }
    public static int[] randomArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество случайных чисел");
        int count = sc.nextInt();
        System.out.println("Введите минимальное значение");
        int min = sc.nextInt();
        System.out.println("Введите максимальное значение");
        int max = sc.nextInt();
        if (count <= 0 || min >= max) {
            System.out.println("Ошибка: некорректный ввод.");
            System.exit(1);
        }
        int[] randomArray = new int[count];
        for(int i = 0;i<count;i++){
            randomArray[i]=getRandom(min,max);
        }
        return randomArray;
    }
}
