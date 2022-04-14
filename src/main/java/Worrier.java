public class Worrier {

    public boolean alive;
    public String name;
    private int health;
    private int strength;
    private int wisdom;
    private int heroic;
    private int arrogant;


    public Worrier(String name, int health, int strength, int wisdom,
                   int heroic, int arrogant,boolean alive) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.wisdom = wisdom;
        this.heroic = arrogant;
        this.alive = alive;
    }


    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength(){
        return strength;
    }

    public int getWisdom(){
        return wisdom;
    }

    public int getHeroic(){
        return arrogant;
    }


}
