package thegardenapplication;

public class Plant {
    String color;
    double waterAmount = 0;
    boolean needWatering;
    String type;
    double waterMinimum;
    double absorbing;

    public Plant(String color) {
        this.color = color;
    }

    public boolean setNeedWatering() {
        if (waterAmount < waterMinimum) {
            needWatering = true;
        } else {
            needWatering = false;
        }
        return needWatering;
    }

    public double wateringPlant(double amountOfWaterForOnePlant) {
        return waterAmount += amountOfWaterForOnePlant * absorbing;
    }
}

