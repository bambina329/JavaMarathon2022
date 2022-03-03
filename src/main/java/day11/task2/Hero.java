package day11.task2;

public abstract class Hero {
    public double health = 100;
    protected double physDef;
    protected double magicDef;
    protected double physAtt;

    public Hero() {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(double physAtt) {
        this.physAtt = physAtt;
    }
}
