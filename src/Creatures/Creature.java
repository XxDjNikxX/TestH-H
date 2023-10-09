package Creatures;

public class Creature {
    private int health;
    private int def;
    private int attack;

    public Creature(int health, int def, int attack) {
        this.health = health;
        this.def = def;
        this.attack = attack;
    }


    public int getHealth() {
        return health;
    }

    public int getDef() {
        return def;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
