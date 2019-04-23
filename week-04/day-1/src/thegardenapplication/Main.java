package thegardenapplication;

public class Main {

    public static void main(String[] args) {

        //testing of app start

        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");

        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        Garden myFirstGarden = new Garden();

        myFirstGarden.addPlantToGarden(yellow);
        myFirstGarden.addPlantToGarden(blue);

        myFirstGarden.addPlantToGarden(purple);
        myFirstGarden.addPlantToGarden(orange);

        myFirstGarden.checkTheStatusOfGarden();
        System.out.println();

        myFirstGarden.wateringOfPlantsInGarden(40);
        System.out.println();

        myFirstGarden.wateringOfPlantsInGarden(70);

        //testing of app end
    }
}
