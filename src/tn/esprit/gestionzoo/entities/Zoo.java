package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private Aquatiques[] aquaticAnimals;
    private String name;
    private String city;
    private String location;
    private final int nbrCages;
    private int animalCount = 0;
    private int aquaticCount = 0;
    private static final int MAX_ANIMALS = 3;

    public Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.aquaticAnimals = new Aquatiques[10];
        this.name = (name == null || name.trim().isEmpty()) ? "Zoo Sans Nom" : name;
        this.city = city;
        this.nbrCages = 10;
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }
    // Getters and Setters
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    // Check if the zoo is full
    public boolean isFull() {
        return animalCount >= MAX_ANIMALS;
    }

    // Add an animal to the zoo
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (isFull()) {
            throw new ZooFullException("Le zoo est plein ! Impossible d'ajouter de nouveaux animaux.");
        }
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif : " + animal.getAge());
        }
        animals[animalCount++] = animal;
        System.out.println(animal.getName() + " a été ajouté avec succès !");
    }

    // Add an aquatic animal
    public void addAquaticAnimal(Aquatiques aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
            System.out.println("Animal aquatique ajouté : " + aquatic.getName());
        } else {
            System.out.println("Aucun espace disponible pour ajouter des animaux aquatiques.");
        }
    }

    // Display all animals in the zoo
    public void displayZooAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println((i + 1) + ". " + animals[i].getName());
        }
    }

    // Display all aquatic animals
    public void displayAquaticAnimals() {
        System.out.println("Animaux aquatiques dans le zoo :");
        for (int i = 0; i < aquaticCount; i++) {
            System.out.println("- " + aquaticAnimals[i].getName());
            aquaticAnimals[i].swim();
        }
    }

    // Compare two zoos by the number of animals
    public static void compareZoos(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            System.out.println(z1.getName() + " est plus grand que " + z2.getName());
        } else if (z1.animalCount < z2.animalCount) {
            System.out.println(z2.getName() + " est plus grand que " + z1.getName());
        } else {
            System.out.println("Les deux zoos ont la même taille.");
        }
    }

    // Remove an animal from the zoo
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index == -1) {
            System.out.println("Erreur : L'animal " + animal.getName() + " n'est pas dans le zoo.");
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[--animalCount] = null;
        System.out.println(animal.getName() + " a été retiré du zoo.");
        return true;
    }

    // Search for an animal by name
    public int searchAnimal(String animalName) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animalName)) {
                return i;
            }
        }
        return -1;
    }

    // Display number of aquatic animals by type
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Daulphine) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
    public boolean zooComparer(Zoo otherZoo) {
        if (otherZoo == null) {
            return false;
        }
        // Compare by name and location (you can customize this logic)
        return this.name.equals(otherZoo.name) && this.location.equals(otherZoo.location);
    }


    // Get the maximum swimming depth of penguins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                maxDepth = Math.max(maxDepth, penguin.getMaxSwimmingDepth());
            }
        }
        return maxDepth;
    }
}
