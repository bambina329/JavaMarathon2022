package day11.task2.heroes;

import day11.task2.Hero;
import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {
    private int magicAtt;

    private int healHimself;
    private int healTeammate;

    public Shaman() {
        physAtt = 10;
        physDef = 15;
        magicAtt = 20;
        magicDef = 20;

        healHimself = 50;
        healTeammate= 30;
    }

    @Override
    public void healHimself() {
        double count = 0;
        count = healTeammate + healHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        double heroHealth = hero.getHealth();
        heroHealth = heroHealth + healTeammate;
        if (heroHealth > 100) {
            hero.setHealth(100);
        } else
        hero.setHealth(heroHealth);
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
