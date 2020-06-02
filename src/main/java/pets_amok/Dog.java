package pets_amok;

public class Dog extends VirtualPet implements Organic {

    private int hunger;
    private int thirst;
    private int crateCleanness;
    private int waste;


    public Dog(String name, String description) {
        super(name, description);
        this.hunger = 5;
        this.thirst = 3;
        this.crateCleanness = 15;
        this.health = 6;
        this.happiness = 12;
    }


    @Override
    public void feed() {

    }

    @Override
    public void water() {

    }

    @Override
    public void cleanCrate() {

    }


    @Override
    public int getHunger() {
        return hunger -= 3;
    }

    @Override
    public int getThirst() {
        return thirst -=2;
    }

    @Override
    public int getWaste() {
        return waste;
    }

    @Override
    public int getCrateCleanness() {
        return crateCleanness;
    }

    public int getWalk() {
        return walk;
    }
}

