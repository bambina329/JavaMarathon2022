package day12;

/*Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
Вывести список в консоль.*/

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> listCar = new ArrayList<>();
        listCar.add("Subaru XV");
        listCar.add("Lada Granta");
        listCar.add("Subaru Forester");
        listCar.add("Subaru Legacy");
        listCar.add("Subaru BRZ");
        System.out.println(listCar);

        listCar.add(2,"BMW X5");
        System.out.println(listCar);

        listCar.remove(0);
        System.out.println(listCar);
    }
}
