package day4;

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя цикл for each вывести в консоль:
        наибольший элемент массива
        наименьший элемент массива
        количество элементов массива, оканчивающихся на 0
        сумму элементов массива, оканчивающихся на 0

        Использовать сортировку запрещено.
*/

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxNum = array[0];
        int minNum = array[0];

        for (int i : array) {
            if (i > maxNum)
                maxNum = i;
        }
        System.out.println("Наибольший элемент массива = " + maxNum);


        for (int i : array) {
            if (i < minNum)
                minNum = i;
        }
        System.out.println("Наименьший элемент массива = " + minNum);

        /// подглядывал ответ по видел
        int elementsEndingInNull = 0;
        for (int i : array) {
            if (i % 10 == 0 )
                elementsEndingInNull ++;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0 = " + elementsEndingInNull);

        int sumElementsEndingInNull = 0;
        for (int i : array) {
            if (i % 10 == 0 )
                sumElementsEndingInNull = sumElementsEndingInNull + i;
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0 =  " + sumElementsEndingInNull);

    }
}


/*
    Для поиска наибольшего и наименьшего элемента массива переменные,
    которые будут хранить эти значения необходимо либо инициализировать уже после заполнения массива, первым элементом этого массива

        max =arr[0]
        min = arr{0]
        либо до массива, но самым "крайним" числом в диапазоне, т.е.

        max = Integer.MIN_VALUE
        min = Integer.MAX_VALUE
        Это максимально универсальный подход.*/
