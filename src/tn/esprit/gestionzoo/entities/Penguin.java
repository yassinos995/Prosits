package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques {
    protected double swimmingDepth;
    public Penguin() {
        super();
        this.swimmingDepth = 0.0;
    }

    // Parameterized constructor
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, double swimmingDepth) {
        super(family, name, age, isMammal, habitat);  // Call the constructor of Aquatiques
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth;
    }
}
