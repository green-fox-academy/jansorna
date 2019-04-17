package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> Animals;
    int placesForAnimals = 10;

    public Farm() {
        this.Animals = new ArrayList<>();
    }

    public void breed(int howMuchnewAnimalsToBreed) {

        for (int i = 0; i < howMuchnewAnimalsToBreed; i++) {
            if (placesForAnimals > 0) {
                Animal newAnimal = new Animal("Animal " + i);
                Animals.add(newAnimal);
                placesForAnimals--;
            }
        }
    }

    public void slaughter() {

        Animal animalToBeEaten = Animals.get(0);

        for (int i = 0; i < Animals.size(); i++) {
            if (Animals.get(i).hunger < animalToBeEaten.hunger) {
                animalToBeEaten = Animals.get(i);
            }
        }
            Animals.remove(animalToBeEaten);
        }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < Animals.size(); i++) {
            result += (i + 1) + ". " + Animals.get(i) + "\n";
        }
        return result;
    }

}
