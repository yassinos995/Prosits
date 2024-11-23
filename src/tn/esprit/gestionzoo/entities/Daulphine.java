package tn.esprit.gestionzoo.entities;

public class Daulphine extends Aquatiques {
    protected double swimmingSpeed;

    // Default constructor
    public Daulphine() {
        super();
        this.swimmingSpeed = 0.0;
    }

    public Daulphine(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat); // Call the parent class constructor
        this.swimmingSpeed = 0.0; // Default swimming speed
    }


    // Getter and Setter for swimmingSpeed
    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed + " km/h";
    }

    // Override swim method
    @Override
    public void swim() {
        System.out.println(getName() + " the dolphin is swimming at " + swimmingSpeed + " km/h!");
    }
}
