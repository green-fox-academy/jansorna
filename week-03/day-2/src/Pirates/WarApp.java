package Pirates;

public class WarApp {
    public static void main(String[] args) {


        Ship blackPearl = new Ship();
        blackPearl.fillShip();

        Ship flyingDutchman = new Ship();
        flyingDutchman.fillShip();

        System.out.println(blackPearl);
        System.out.println(flyingDutchman);

        System.out.println("Statement if Black Pearl defeated Flying Dutchman: ");
        System.out.println(blackPearl.battle(flyingDutchman));
        System.out.println();

        System.out.println(blackPearl);
        System.out.println(flyingDutchman);

        Armada spanish = new Armada();
        spanish.fillArmada();

        Armada british = new Armada();
        british.fillArmada();


        System.out.println(spanish);
        System.out.println(british);

        System.out.println(spanish.war(british));

    }
}
