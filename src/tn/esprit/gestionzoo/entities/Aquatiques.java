package tn.esprit.gestionzoo.entities;

public abstract class Aquatiques extends Animal implements Carnivore {
    private String habitat;  // Assuming habitat is a property in Aquatic

    public Aquatiques(String type, String name, int age, boolean isWild, String habitat) {
        super(type, name, age, isWild);
        this.habitat = habitat;
    }

    public Aquatiques() {

    }

    // Getters and Setters for habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Overriding the equals() method
    @Override
    public boolean equals(Object obj) {
        // Check if the object is the same instance
        if (this == obj) {
            return true;
        }

        // Check if the object is an instance of Aquatiques
        if (!(obj instanceof Aquatiques)) {
            return false;
        }

        // Cast the object to Aquatiques
        Aquatiques other = (Aquatiques) obj;

        // Compare name, age, and habitat
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    // You might also want to override hashCode() when you override equals()
    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + habitat.hashCode();
        return result;
    }
    @Override
    public void eatMeat(Food food) {
        // Implementation for eating meat
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println(getName() + " is eating " + food + " (meat).");
        } else {
            System.out.println(getName() + " cannot eat " + food + " (not meat).");
        }
    }

    public abstract void swim();
}
