package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crew;
    List<Pirate> captain;
    String nameOfTheShip;
    static int shipCounter;
    int alivePiratesCounter;

    public Ship() {

        this.crew = new ArrayList<>();
        this.captain = new ArrayList<>();

        shipCounter++;
        this.nameOfTheShip = "Ship " + shipCounter;
    }

    public void fillShip() {
        captain.add(new Pirate());
        captain.get(0).promotion();
        if (Math.random() > 0.5) {
            captain.get(0).drinkSomeRum();
        }

        for (int i = 0; i < (int) (Math.random() * 1000); i++) {
            crew.add(new Pirate());
            crew.get(i).drinkSomeRum();
            crew.get(i).brawl(crew.get((int) (Math.random() * crew.size())));
        }
        alivePiratesCounter();
    }

    public int alivePiratesCounter() {
        for (Pirate memberOfCrew : crew) {
            if (memberOfCrew.dead) {
            } else {
                alivePiratesCounter++;
            }
        }
        return alivePiratesCounter;
    }


    public boolean battle(Ship otherShip) {

        if (this.alivePiratesCounter - this.captain.get(0).consumedRum > otherShip.alivePiratesCounter - otherShip.captain.get(0).consumedRum) {
            partHard(this);
            crewLost(otherShip);
            return true;
        } else {
            partHard(otherShip);
            crewLost(this);
            return false;
        }
    }

    public void partHard(Ship winningShip) {
        for (int i = 0; i < winningShip.crew.size(); i++) {
            winningShip.crew.get(i).drinkSomeRum();
        }
        winningShip.captain.get(0).drinkSomeRum();
    }

    public void crewLost(Ship looosingShip) {
        for (int i = 0; i < (int) ((int) (Math.random() * looosingShip.crew.size())); i++) {
            looosingShip.crew.get(i).die();
            alivePiratesCounter = 0;
            alivePiratesCounter();
        }
    }

    @Override
    public String toString() {
        String result = "";

        result += "Name of the Ship: " + nameOfTheShip + "\n";

        for (int i = 0; i < captain.size(); i++) {
            result += captain.get(i) + "\n";
        }

        result += "Number of alive Pirates on the ship: " + alivePiratesCounter + "\n";

        return result;
    }
}
