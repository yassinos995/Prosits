package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        setAge(age);
        this.age=age;
        this.isMammal=isMammal;
    }
    //done
    @Override
    public String toString() {
        return "Animal [Family: " + family + ", Name: " + name + ", Age: " + age + ", isMammal: " + isMammal + "]";
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isValidName() {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom de l'animal ne peut pas être vide.");
            return false;
        }
        return true;
    }
    public boolean isValidAge() {
        if (age < 0  || name.trim().isEmpty()) {
            System.out.println("L'age de l'animal n'est pas logique.");
            return false;
        }
        return true;
    }
}
