package thegardenapplication;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
        type = "Flower";
        waterMinimum = 5;
        absorbing = 0.75;
    }
}
