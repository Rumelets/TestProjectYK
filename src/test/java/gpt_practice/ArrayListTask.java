package gpt_practice;

import java.util.ArrayList;

public class ArrayListTask extends GetRandom{
    static int sum;
    public static void main(String[]args){
        ArrayList<Integer> randoms = new ArrayList<>();
        int[] randomArray = randomArray();
        for(int i = 0; i<randomArray.length;i++){
            randoms.add(randomArray[i]);
            sum+=randoms.get(i);
        }
        System.out.printf("Сумма всех рандомных чисел %s",sum);
    }
}