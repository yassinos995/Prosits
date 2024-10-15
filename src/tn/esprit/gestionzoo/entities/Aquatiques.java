package tn.esprit.gestionzoo.entities;

public class Aquatiques extends Animal{
    String habitat;
    public Aquatiques() {
        super();
        this.habitat = "Unknown";
    }

    // Parameterized constructor
    public Aquatiques(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);  // Call the constructor of Animal
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming ");
    }
}
