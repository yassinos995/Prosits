package tn.esprit.gestionzoo.entities;

public class Terrests extends Animal implements Omnivore {
    int nbrLegs;

    public Terrests() {
        super();
        this.nbrLegs = 4;  // Default number of legs
    }

    // Parameterized constructor
    public Terrests(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);  // Call the constructor of Animal
        this.nbrLegs = nbrLegs;
    }

    // Implementation of Carnivore interface
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println(getName() + " is eating " + food + " (meat).");
        } else {
            System.out.println(getName() + " cannot eat " + food + " (not meat).");
        }
    }

    // Implementation of Herbivore interface
    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANT || food == Food.BOTH) {
            System.out.println(getName() + " is eating " + food + " (plant).");
        } else {
            System.out.println(getName() + " cannot eat " + food + " (not plant).");
        }
    }

    // Implementation of Omnivore interface
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both plant and meat.");
        } else {
            System.out.println(getName() + " cannot eat " + food + " (needs both).");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }
}
