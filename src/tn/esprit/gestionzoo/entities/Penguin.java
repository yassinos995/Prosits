package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatiques {
    private float maxSwimmingDepth; // Maximum depth a penguin can swim
    protected double swimmingDepth;

    // Default constructor
    public Penguin() {
        super("Bird", "Penguin", 3, true, "Antarctic waters");  // Call to the Aquatiques constructor
        this.swimmingDepth = 0.0;
        this.maxSwimmingDepth = 150.0f;
    }

    // Parameterized constructor that matches your use case
    public Penguin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);  // Calling the constructor of Aquatiques
        this.swimmingDepth = 0.0;
        this.maxSwimmingDepth = 150.0f; // Default max depth
    }

    // Getter for maxSwimmingDepth
    public float getMaxSwimmingDepth() {
        return maxSwimmingDepth;
    }

    // Setter for swimmingDepth
    public void setSwimmingDepth(double swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters, Max Depth: " + maxSwimmingDepth + " meters";
    }

    // Override swim method
    @Override
    public void swim() {
        System.out.println(getName() + " the penguin is diving to a depth of " + swimmingDepth + " meters!");
    }
}
