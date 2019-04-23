package thegardenapplication;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    public boolean setNeedWatering() {
        if (waterAmount < 5) {
            return needWatering = true;
        }
        return needWatering = false;
    }

    public double wateringFlower(double amountOfWaterForOneFlower) {
        return waterAmount += amountOfWaterForOneFlower * 0.75;
    }
}
