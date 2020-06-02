package pets_amok;

import java.util.Random;

public class VirtualPet {

    Random random = new Random();

    protected int health;
    protected int happiness;
    protected int walk;
    private String name;
    private String description;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        health = random.nextInt(20);
        happiness = random.nextInt(20);
    }

    public VirtualPet(String name, String description, int health, int happiness) {

        this.name = name;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getWalk() {
        return walk;
    }

    public void tick(){
    }
}

