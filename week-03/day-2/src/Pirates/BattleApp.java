package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        //Ship testing
        Ship blackPearl = new Ship();
        blackPearl.fillShip();

        Ship flyingDutchman = new Ship();
        flyingDutchman.fillShip();

        System.out.println(blackPearl);
        System.out.println(flyingDutchman);

        System.out.println("Statement if Black Pearle defetead Flying Dutchman: ");
        System.out.println(blackPearl.battle(flyingDutchman));
        System.out.println();

        System.out.println(blackPearl);
        System.out.println(flyingDutchman);

    }
}
