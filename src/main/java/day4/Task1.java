package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();

        Random rand = new Random();

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(10);

        System.out.println(Arrays.toString(array));

        System.out.println("Длина массива: " + array.length);

        int numbersGreaterThan8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                numbersGreaterThan8++;
        }
        System.out.println("Количество чисел больше 8: " + numbersGreaterThan8);

        int numbersEqual1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                numbersEqual1++;
        }
        System.out.println("Количество чисел равных 1: " + numbersEqual1);

        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0)
                evenNumbers++;
        }
        System.out.println("Количество четных чисел: " + evenNumbers);

        int oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0)
                oddNumbers++;
        }
        System.out.println("Количество нечетных чисел: " + oddNumbers);

        int sumArray = 0;
        for (int i =0; i < array.length; i++)
        sumArray = sumArray+ array[i];
        System.out.println("Сумма всех элементов массива: " + sumArray);

    }
}



