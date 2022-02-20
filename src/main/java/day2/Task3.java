package day2;

import java.util.Scanner;

/*2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).

Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, но при этом не делятся на 10 без остатка.

Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка),
но число 20 не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка).
Сами числа a и b в диапазоне не учитывать.
Если a >= b вывести сообщение "Некорректный ввод".*/


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int t = a+1;

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (t < b) {
            if ((t % 5 == 0) && (t % 10 != 0) )
                System.out.print(t + " ");
                t++;
        }

    }

}

