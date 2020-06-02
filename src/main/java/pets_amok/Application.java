package pets_amok;

import java.awt.*;
import java.util.Collection;
import java.util.Scanner;

public class Application {

    private static Scanner input = new Scanner(System.in);
    private static VirtualPetShelter shelter = new VirtualPetShelter();
    private static Collection<VirtualPet> petList = shelter.showAllPets();

    public static void main(String[] args) {

        welcomeMessage();
        creatPets();
        showPets();
        gameLoop();
        gameActions();
    }

    private static void gameLoop() {
        gameActions();
    }

    private static void welcomeMessage() {
        System.out.println("Welcome to The NEW Virtual Pet Shelter!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Press ENTER to Start.");
        input.nextLine();
    }

    private static void creatPets() {
        shelter.addPet("Scully", new Cat("Scully", "Truth Seeking Organic Cat"));
        shelter.addPet("Mulder", new Dog("Mulder", "Truth Seeking Organic Dog"));
//        shelter.addPet("Reyes", new RoboticCat ("Reyes", "FBI Robotic Cat"));
//        shelter.addPet("Doggett", new RoboticDog ("Doggett", "FBI Robotic Dog"));
    }


    private static void showPets() {
        for (VirtualPet pet : petList)
            if (pet instanceof Organic)
                System.out.println(pet.getName() + ":" + "\t" + (pet.getDescription()) + "\n" +
                        "\tHealth: " + pet.getHealth() +
                        "\tHappiness: " + pet.getHappiness() +
                        "\tHunger: " + ((Organic) pet).getHunger() +
                        "\tThirst: " + ((Organic) pet).getThirst() +
                        "\t Crate: " + ((Organic) pet).getCrateCleanness());
    }

    private static void gameActions() {
        System.out.println("What would you like to do next?");
        System.out.println();
        System.out.println("[1] Feed All Organic Pets");
        System.out.println("[2] Water All Organic Pets");
        System.out.println("[3] Oil All Robotic Pets");
        System.out.println("[4] Maintain All Robotic Pets");
        System.out.println("[5] Walk All Dogs");
        System.out.println("[6] Clean All Crates");
        System.out.println("[7] Pick An Individual Pet To Play With");
        System.out.println("[8] ♥ Adopt A Pet! ♥");
        System.out.println("[9] Admit A Pet To The Shelter");
        System.out.println("[10] Exit The Virtual Shelter");

        int userChoice = input.nextInt();
        input.nextLine();


        switch (userChoice) {
            case 1:
                shelter.feedAllPets();
                showPets();
                break;
//            case 2:
//                shelter.cuddleAllPets();
//                showPets();
//                break;
//            case 3:
//                pickAPet();
//                break;
//            case 4:
//                adoptAPet();
//                break;
//            case 5:
//                admitAPet();
//                break;
//            case 6:
//                System.out.println("♥ Thanks For Visiting The Virtual Pet Shelter! ♥");
//                System.exit(0);
//        }
        }


    }
}


// create pets here
// feed/water all organic pets
// oil robotic pets
// walk all doggos
// clean all crates/litter boxes

