package absoft;
import java.util.Arrays;

import static org.bouncycastle.util.Arrays.append;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

public class test10_array2 {
    public static void main(String [] args){
        String[] array = new String[] {"John", "Dan", "Ashe", "Carl", "Bill"};
        Arrays.sort(array);
        array = append(array,"Stan");
        for(int x = 0; x<array.length;x++) {
            System.out.println(array[x]);
        }
    }

}
