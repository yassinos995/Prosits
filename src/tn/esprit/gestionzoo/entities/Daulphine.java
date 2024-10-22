package tn.esprit.gestionzoo.entities;

public class Daulphine extends Aquatiques {
    protected double swimmingSpeed;
    public Daulphine() {
        super();
        this.swimmingSpeed = 0.0;
    }

    // Parameterized constructor
    public Daulphine(String family, String name, int age, boolean isMammal, String habitat, double swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming");
    }


}
