package thegardenapplication;

public class Main {

    public static void main(String[] args) {

        //testing of app start

        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");

        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        Garden myFirstGarden = new Garden();

        myFirstGarden.addFlowerToGarden(yellow);
        myFirstGarden.addFlowerToGarden(blue);

        myFirstGarden.addTreeToGarden(purple);
        myFirstGarden.addTreeToGarden(orange);

        myFirstGarden.checkTheStatusOfGarden();
        System.out.println();

        myFirstGarden.wateringTheWholeGarden(40);
        System.out.println();

        myFirstGarden.wateringTheWholeGarden(70);

        //testing of app end
    }
}
