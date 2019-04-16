package PetrolStation;

public class Main {
    public static void main(String[] args) {

        //start testing
        Station firstStation = new Station(5000);

        Car porsche = new Car();

        firstStation.refill(porsche);

        System.out.println(firstStation.gasAmount);
        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);
        //end testing
    }
}
