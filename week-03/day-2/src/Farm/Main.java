package Farm;

public class Main {

    public static void main(String[] args) {

        //start testing
        Farm newFarm = new Farm();

        newFarm.breed(5);

        newFarm.Animals.get(2).eat();

        newFarm.slaughter();

        for (Animal animal: newFarm.Animals) {
            System.out.println(animal);
        }
    }
}
