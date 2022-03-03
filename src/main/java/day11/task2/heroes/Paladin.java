package day11.task2.heroes;

import day11.task2.Hero;
import day11.task2.interfaces.Healer;
import day11.task2.interfaces.PhysAttack;

public class Paladin extends Hero implements Healer, PhysAttack {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;

        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public void healHimself() {
        double count = getHealth();
        count = count + healHimself;
        setHealth(count);
    }

    @Override
    public void healTeammate(Hero hero) {
        double heroHealth = hero.getHealth();
        heroHealth = heroHealth + healTeammate;
        hero.setHealth(heroHealth);

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
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
