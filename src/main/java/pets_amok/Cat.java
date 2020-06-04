package pets_amok;

public class Cat extends VirtualPet implements Organic {

    private int hunger;
    private int thirst;
    private int waste;
    private int crateCleanness;


    public Cat(String name, String description) {
        super(name, description);
        this.hunger = 17;
        this.thirst = 14;
        this.health = 7;
        this.happiness = 12;
        this.crateCleanness = 8;


    }

    @Override
    public void feed() {
        hunger -= 2;
    }

    @Override
    public void water() {
        thirst -= 3;
    }

    @Override
    public void cleanCrate() {
        crateCleanness -= 3;
    }

    @Override
    public void tick() {
        hunger += 3;
        thirst += 2;
        waste += 1;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public int getThirst() {
        return thirst;
    }

    @Override
    public int getWaste() {
        return waste;
    }

    @Override
    public int getCrateCleanness() {
        return crateCleanness;
    }


}

