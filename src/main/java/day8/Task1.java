package day8;

/*
Создать строку, состоящую из чисел от 0 до 20 000.
Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).

После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:

        0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и использовании StringBuilder,
реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
*/

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода

        String string1 = new String("");
        for (int i = 0; i < 20001; i++) {
            string1 = string1 + i + " ";
        }
        System.out.println(string1);

        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        long timeElapsed = stopTime - startTime;



        long startTime2 = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            stringBuilder.append(i + " ");
        }
        long stopTime2 = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        long timeElapsed2 = stopTime2 - startTime2;
        System.out.print(stringBuilder.toString());
        System.out.println();
        System.out.println("Время работы через конкотинацию, в работа в милисекундах: " + timeElapsed);
        System.out.println("Метод через StringBuilder, работа в милисекундах: " + timeElapsed2);

    }
}
