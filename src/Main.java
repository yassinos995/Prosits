import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
        // Creating terrestrial animals
        Animal lion = new Animal("fadeo", "simba", 100, true);
        Animal bird = new Animal("flyer", "twiti", 1, false);
        Animal mouse = new Animal("mouses", "jerry", 4, true);

        // Create aquatic animals
        Daulphine dolphin = new Daulphine();  // Assuming Dolphin is a subclass of Aquatiques
        Penguin penguin = new Penguin();  // Assuming Penguin is also a subclass of Aquatiques
        Aquatiques dolphin1 = new Aquatiques("Marine Mammal", "Dolphin", 5, true, "Ocean");
        Aquatiques dolphin2 = new Aquatiques("Marine Mammal", "Dolphin", 5, true, "Ocean");
        if (dolphin1.equals(dolphin2)) {
            System.out.println("Both dolphins are identical.");
        } else {
            System.out.println("Dolphins are not identical.");
        }

        // Create the zoo
        Zoo myZoo = new Zoo("Aquatic World", "Tunis");

        // Add aquatic animals to the zoo

        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);

        // Display aquatic animals and their swimming action
        myZoo.displayAquaticAnimals();

        Zoo friguiaZoo = new Zoo("Friguia", "Nabeul");

        // Add terrestrial animals to the zoo
        if (!friguiaZoo.isFull()) friguiaZoo.addAnimal(mouse);
        if (!friguiaZoo.isFull()) friguiaZoo.addAnimal(lion);
        if (!friguiaZoo.isFull()) friguiaZoo.addAnimal(bird);

        // Display all animals in the zoo
        friguiaZoo.displayZooAnimals();

        // Search for an animal in the zoo
        String animalName = "aziz";
        int index = friguiaZoo.searchAnimal(animalName);
        if (index != -1) {
            System.out.println("Animal found: " + friguiaZoo.getAnimals()[index] + " at index " + index);
        } else {
            System.out.println("Animal: " + animalName + " does not exist.");
        }

        // Check if the zoo is full
        friguiaZoo.isFull();
    }
}
