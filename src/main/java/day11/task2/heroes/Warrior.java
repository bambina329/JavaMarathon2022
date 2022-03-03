package day11.task2.heroes;

import day11.task2.Hero;

import day11.task2.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        physAtt = 30;
        physDef = 0.8;
        magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double heroHealth = hero.getHealth();
        if (heroHealth <= 0) {                       // делал три вечера, так как днем на работе по часа два сидел но видос не смотрел, походу топорно сделал
            hero.setHealth(0);
            return;
        } else {
            double heroPhysDef = hero.getPhysDef();
            double effectAtt = physAtt - physAtt * heroPhysDef;
            heroHealth = heroHealth - effectAtt;
            if (heroHealth < 0) {
                hero.setHealth(0);
            }
               else
            hero.setHealth(heroHealth);
        }
    }


    @Override
    public String toString() {
        return "Warrior{" + "health=" + health + '}';
    }
}
