package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Carnivore;
import tn.esprit.gestionzoo.entities.Food;
import tn.esprit.gestionzoo.entities.Herbivore;

public interface Omnivore extends Carnivore, Herbivore {
    void eatPlantAndMeat(Food food);
}
