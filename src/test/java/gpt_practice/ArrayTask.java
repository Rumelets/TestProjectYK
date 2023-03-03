package gpt_practice;

public class ArrayTask extends GetRandom {
    public static void main (String[]args){
        int[] randomArray = randomArray();
        for (int j : randomArray) {
            if (j < minValue) {
                minValue = j;
            }
        }
        for(int j: randomArray){
            if(j>maxValue){
                maxValue=j;
            }
        }
        System.out.printf("Минимальное число в массиве - %s. Максимальное число в массиве - %s",minValue,maxValue);
    }
}