package thegardenapplication;

import java.util.ArrayList;

public class Garden {
    ArrayList<Plant> plants;

    int howManyPlantsNeedsWatering = 0;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void addPlantToGarden(Plant inputPlant) {
        this.plants.add(inputPlant);
    }

    public int countPlantsNeedingWatering() {
        for (Plant inspectedPlant : plants) {
            inspectedPlant.setNeedWatering();
            if (inspectedPlant.needWatering) {
                howManyPlantsNeedsWatering++;
            }
        }
        return howManyPlantsNeedsWatering;
    }

    public void wateringOfPlantsInGarden(double wateringAmount) {
        System.out.println("Watering with " + wateringAmount);

        double amountOfWaterForOnePlant = wateringAmount / countPlantsNeedingWatering();
        for (Plant wateredPlant : plants) {
            if (wateredPlant.needWatering) {
                wateredPlant.wateringPlant(amountOfWaterForOnePlant);
            }
        }
        checkTheStatusOfGarden();
        howManyPlantsNeedsWatering = 0;
    }

    public void checkTheStatusOfGarden() {
        for (Plant inspectedPlant : plants) {
            inspectedPlant.setNeedWatering();
            if (inspectedPlant.needWatering) {
                System.out.println("The " + inspectedPlant.color + " " + inspectedPlant.type + " needs water");
            } else {
                System.out.println("The " + inspectedPlant.color + " " + inspectedPlant.type + " doesnt need water");
            }
        }
    }
}


