package thegardenapplication;

import java.util.ArrayList;

public class Garden {
    ArrayList<Flower> flowers;
    ArrayList<Tree> trees;

    int howManyFLowersNeedsWatering;
    int howManyTreesNeedsWatering;


    public Garden() {
        this.flowers = new ArrayList<>();
        this.trees = new ArrayList<>();
    }

    public void addFlowerToGarden(Flower givenFlower) {
        this.flowers.add(givenFlower);
    }

    public void addTreeToGarden(Tree givenTree) {
        this.trees.add(givenTree);
    }

    public int countFlowersNeedsWatering() {
        for (Flower inspectedFlower : flowers) {
            if (inspectedFlower.needWatering) {
                howManyFLowersNeedsWatering++;
            }
        }
        return howManyFLowersNeedsWatering;
    }

    public int countTreesNeedsWatering() {
        for (Tree inspectedTree : trees) {
            if (inspectedTree.needWatering) {
                howManyTreesNeedsWatering++;
            }
        }
        return howManyTreesNeedsWatering;
    }


    public void wateringOfFlowersInGarden(double wateringAmount) {
        countFlowersNeedsWatering();
        countTreesNeedsWatering();
        double amountOfWaterForOneFlower = wateringAmount / (howManyFLowersNeedsWatering + howManyTreesNeedsWatering);

        for (Flower wateredFlower : flowers) {
            if (wateredFlower.needWatering) {
                wateredFlower.wateringFlower(amountOfWaterForOneFlower);
            }
        }
        howManyFLowersNeedsWatering = 0;
        howManyTreesNeedsWatering = 0;
    }

    public void wateringOfTreesInGarden(double wateringAmount) {
        countTreesNeedsWatering();
        countFlowersNeedsWatering();
        double amountOfWaterForOneTree = wateringAmount / (howManyFLowersNeedsWatering + howManyTreesNeedsWatering);

        for (Tree wateredTree : trees) {
            if (wateredTree.needWatering) {
                wateredTree.wateringTree(amountOfWaterForOneTree);
            }
        }
        howManyTreesNeedsWatering = 0;
        howManyFLowersNeedsWatering = 0;
    }

    public void wateringTheWholeGarden(int wateringAmount){
        System.out.println("Watering with " + wateringAmount);
        wateringOfFlowersInGarden(wateringAmount);
        wateringOfTreesInGarden(wateringAmount);
        checkTheStatusOfGarden();
    }

    public void checkTheStatusOfGarden() {

        for (Flower inspectedFlower : flowers) {
            inspectedFlower.setNeedWatering();
            if (inspectedFlower.needWatering) {
                System.out.println("The " + inspectedFlower.color + " Flower needs water");
            } else {
                System.out.println("The " + inspectedFlower.color + " Flower doesnt need water");
            }
        }
        for (Tree inspectedTree : trees) {
            inspectedTree.setNeedWatering();
            if (inspectedTree.needWatering) {
                System.out.println("The " + inspectedTree.color + " Tree needs water");
            } else {
                System.out.println("The " + inspectedTree.color + " Tree doesnt need water");
            }
        }
    }
}


