import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating terrestrial animals
            Animal lion = new Animal("tn.esprit.gestionzoo.entities.Carnivore", "Simba", 5, true);
            Animal bird = new Animal("tn.esprit.gestionzoo.entities.Omnivore", "Tweety", 2, false);
            Animal mouse = new Animal("tn.esprit.gestionzoo.entities.Herbivore", "Jerry", 1, true);
            Terrests tiger = new Terrests("Carnivore", "Tiger", 4, true, 4);

            // Creating aquatic animals
            Daulphine dolphin = new Daulphine("Marine Mammal", "Dolphin", 7, true, "Ocean");
            Penguin penguin = new Penguin("Bird", "Penguin", 3, false, "Arctic");

            // Comparing two aquatic animals
            Aquatiques dolphin1 = new Daulphine("Marine Mammal", "Dolphin", 5, true, "Ocean");
            Aquatiques dolphin2 = new Daulphine("Marine Mammal", "Dolphin", 5, true, "Ocean");

            if (dolphin1.equals(dolphin2)) {
                System.out.println("Both dolphins are identical.");
            } else {
                System.out.println("Dolphins are not identical.");
            }

            // Create the first zoo
            Zoo myZoo = new Zoo("Aquatic World", "Tunis");
            tiger.eatMeat(Food.MEAT); 
            tiger.eatPlant(Food.PLANT);
            tiger.eatPlantAndMeat(Food.BOTH);
            // Add aquatic animals to the zoo
            myZoo.addAquaticAnimal(dolphin);
            myZoo.addAquaticAnimal(penguin);

            // Display aquatic animals and their swimming action
            myZoo.displayAquaticAnimals();

            // Create another zoo
            Zoo friguiaZoo = new Zoo("Friguia", "Nabeul");

            // Add terrestrial animals to the zoo
            if (!friguiaZoo.isFull()) friguiaZoo.addAnimal(mouse);
            if (!friguiaZoo.isFull()) friguiaZoo.addAnimal(lion);
            if (!friguiaZoo.isFull()) friguiaZoo.addAnimal(bird);

            // Display all animals in the zoo
            friguiaZoo.displayZooAnimals();

            // Search for an animal in the zoo
            String animalName = "Simba";
            int index = friguiaZoo.searchAnimal(animalName);
            if (index != -1) {
                System.out.println("Animal found: " + friguiaZoo.getAnimals()[index].getName() + " at index " + index);
            } else {
                System.out.println("Animal: " + animalName + " does not exist.");
            }
            if (myZoo.zooComparer(friguiaZoo)) {
                System.out.println("The two zoos are the same.");
            } else {
                System.out.println("The two zoos are different.");
            }
            // Check if the zoo is full
            friguiaZoo.isFull();
        } catch (ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}
