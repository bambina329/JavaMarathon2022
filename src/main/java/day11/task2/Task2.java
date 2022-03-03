package day11.task2;

import day11.task2.heroes.Magician;
import day11.task2.heroes.Paladin;
import day11.task2.heroes.Shaman;
import day11.task2.heroes.Warrior;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        /*Воин атакует Паладина*/
        warrior.physicalAttack(paladin);
        System.out.println("1 " + paladin);

        /*Паладин атакует Мага*/
        paladin.physicalAttack(magician);
        System.out.println("2 " + magician);

        /*Шаман лечит Мага*/
        shaman.healTeammate(magician);
        System.out.println("3 " + magician);

        /*Маг атакует Паладина, тип атаки М*/
        magician.magicalAttack(paladin);
        System.out.println("4 " + paladin);

        shaman.physicalAttack(warrior);
        System.out.println("5 " + warrior);

        paladin.healHimself();
        System.out.println("6 " + paladin);

        warrior.physicalAttack(magician);
        System.out.println("7 " + magician);

        warrior.physicalAttack(magician);
        System.out.println("8 " + magician);

        warrior.physicalAttack(magician);
        System.out.println("9 " + magician);

        warrior.physicalAttack(magician);
        System.out.println("10 " + magician);

        warrior.physicalAttack(magician);
        System.out.println("11 " + magician);


    }
}
