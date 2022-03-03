package day11.task2.heroes;

import day11.task2.Hero;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int magicAtt;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicAtt = 20;
        magicDef = 0.8;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double heroHealth = hero.getHealth();
        if (heroHealth <= 0) {
            hero.setHealth(0);
            return;
        } else {
            double heroMagicDef = hero.getMagicDef();
            double effectAtt = magicAtt - magicAtt * heroMagicDef;
            heroHealth = heroHealth - effectAtt;
            hero.setHealth(heroHealth);
        }
    }


    @Override
    public void physicalAttack(Hero hero) {
        double heroHealth = hero.getHealth();
        if (heroHealth <= 0) {
            hero.setHealth(0);
            return;
        } else {
            double heroPhysDef = hero.getPhysDef();
            double effectAtt = physAtt - physAtt * heroPhysDef;
            heroHealth = heroHealth - effectAtt;
            hero.setHealth(heroHealth);
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
