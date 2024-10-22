package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques {
    private float maxSwimmingDepth;
    protected double swimmingDepth;
    public Penguin() {
        super("Bird", "Penguin", 3, true, "Antarctic waters");
        this.swimmingDepth = 0.0;
        this.maxSwimmingDepth = 150.0f;
    }
    @Override
    public void swim() {
        System.out.println(getName() + " is diving into the icy waters!");
    }

    public float getMaxSwimmingDepth() {
        return maxSwimmingDepth; // Method to get the maximum swimming depth
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
