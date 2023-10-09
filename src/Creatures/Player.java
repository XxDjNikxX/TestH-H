package Creatures;

public class Player extends Creature {
    private int healthCounter;
    private int health;
    private int def;
    private int attack;

    public Player(int def, int attack, int helath) {
      super(def,attack,helath);
    }


    public void setHealth(int health) {
        if(healthCounter <=4){
            this.health = (int) (health * 0.30);
        }
        else {
            this.health = health;
        }
    }

    public int getHealth() {
        return health;
    }
}
