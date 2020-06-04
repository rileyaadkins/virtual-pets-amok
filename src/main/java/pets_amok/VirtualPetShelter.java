package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> petList = new HashMap<>();
    private Collection<VirtualPet> pets = petList.values();


    public VirtualPetShelter() {
    }

    public void petNames() {
        for (Map.Entry<String, VirtualPet> entry : petList.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());
    }

    public Collection<VirtualPet> showAllPets() {
        return petList.values();
    }

    public void addPet(String name, VirtualPet pet) {
        petList.put(name, pet);
    }

    public void removePet(String name) {
        petList.remove(name);
    }

    public void feedAllPets() {
        for (VirtualPet pet : petList.values())
            if (pet instanceof Organic)((Organic) pet).feed();
    }

    public void waterAllPets() {
        for (VirtualPet pet : petList.values())
            if (pet instanceof Organic)((Organic) pet).water();
    }

//    public void walkAllDogs() {
////        for (VirtualPet pet : petList.values())
////            pet.walk();
//
//    }

    public void cleanAllCages() {

    }

    public void oilRoboticPets() {

    }

    public void playWithPet(String name) {
        for (String petName : petList.keySet()) {
            if (petName.equalsIgnoreCase(name)) {
                petList.get(petName).getHappiness();
                System.out.println("You Played With " + petName);
            }
        }
    }

    public void tickAll(){
        for (VirtualPet pet : petList.values()){
            pet.tick();
        }

    }


}



