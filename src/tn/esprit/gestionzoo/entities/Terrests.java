package tn.esprit.gestionzoo.entities;

public class Terrests extends Animal {
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

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }
}

