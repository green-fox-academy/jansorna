package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> armada;

    public Armada() {
        this.armada = new ArrayList<>();
    }

    public void fillArmada() {

        for (int i = 0; i < (int) (Math.random() * 100); i++) {
            armada.add(new Ship());
        }
    }

    public boolean war(Armada otherArmada) {
        int shipOfFirstArmada = 0;
        int shipOfSecondArmada = 0;

        while (shipOfFirstArmada < this.armada.size() - 1 && shipOfSecondArmada < otherArmada.armada.size() - 1) {
            while (this.armada.get(shipOfFirstArmada).battle(otherArmada.armada.get(shipOfSecondArmada))) {
                shipOfSecondArmada++;
            }
            while (otherArmada.armada.get(shipOfSecondArmada).battle(this.armada.get(shipOfFirstArmada))) {
                shipOfFirstArmada++;
            }
        }
        if (shipOfFirstArmada > shipOfSecondArmada) {
            return true;
        } else {
            return false;
        }
    }
}

