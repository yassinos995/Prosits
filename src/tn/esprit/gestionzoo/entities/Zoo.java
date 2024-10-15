package tn.esprit.gestionzoo.entities;
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;
    int animaux;  // Tracks the number of animals added to the zoo

    public Zoo(String name, String city) {

        this.animals = new Animal[25];  // Initializes an array of size 25
        this.name = name;
        this.city = city;
        this.nbrCages = 10;  // Maximum capacity of the zoo is 5 animals (or cages)
        this.animaux = 0;
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo est requis. Impossible de créer un zoo sans nom.");
        } else {
            this.name = name;
        }

    }

    // Getters and Setters for attributes
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {  // Corrected setter method name
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }
    public void zooComparer(Zoo z1, Zoo z2 ){
     if (z1.animaux > z2.animaux){
         System.out.println("le"+z1+"est le plus grand que"+z2);
     } else if (z1.animaux < z2.animaux) {
         System.out.println("le"+z2+"est le plus grand que"+z1);
     }else{
         System.out.println("les deux zoo sont egaux");
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
        if (animaux >= nbrCages) {
            System.out.println("Le zoo " + name + " est plein !");
            return true;
        } else {
            System.out.println("Le zoo " + name + " a encore de la place.");
            return false;
        }
    }

    // Adds an animal to the zoo if it's not full
    public boolean addAnimal(Animal animal) {
        // Check if the zoo name is valid
        if (this.name == null || this.name.trim().isEmpty()) {
            System.out.println("Impossible d'ajouter des animaux. Le zoo n'a pas de nom valide.");
            return false;
        }

        // Check if the zoo is full
        if (isFull()) {
            System.out.println("Impossible d'ajouter " + animal.getName() + ". Le zoo est plein.");
            return false;
        }

        // Check if the animal's name is valid (not empty or null)
        if (animal.getName() == null || animal.getName().trim().isEmpty()) {
            System.out.println("Le nom de l'animal est requis. Impossible d'ajouter cet animal.");
            return false;
        }

        // Check if the animal's age is valid (not negative)
        if (animal.getAge() < 0) {
            System.out.println("L'âge de l'animal ne peut pas être négatif. Impossible d'ajouter " + animal.getName() + ".");
            return false;
        }

        // If all checks pass, add the animal to the zoo
        animals[animaux] = animal;
        animaux++;
        System.out.println(animal.getName() + " a été ajouté au zoo.");
        return true;
    }





    // Displays the list of animals in the zoo
    public void displayZooAnimals() {
        System.out.println("Liste des animaux dans notre zoo " + name + " :");
        for (int i = 0; i < animaux; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }

    // Searches for an animal by name and returns its index
    public int searchAnimal(String animalName) {
        for (int i = 0; i < animaux; i++) {
            if (animals[i].getName().equals(animalName)) {
                return i;
            }
        }
        return -1;
    }

    // Removes an animal from the zoo
    public boolean supprimerAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index == -1) {
            System.out.println("Erreur : L'animal " + animal.getName() + " n'est pas dans le zoo.");
            return false;
        }

        // Shift the remaining animals to the left
        for (int i = index; i < animaux - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animaux - 1] = null;  // Remove the last duplicate
        animaux--;  // Decrement the count of animals
        System.out.println(animal.getName() + " a été retiré du zoo.");
        return true;
    }
}
