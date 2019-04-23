package thegardenapplication;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    public boolean setNeedWatering() {
        if (waterAmount < 10) {
            return needWatering = true;
        }
        return needWatering = false;
    }

    public double wateringTree(double amountOfWaterForOneTree) {
        return waterAmount += amountOfWaterForOneTree * 0.4;
    }
}
