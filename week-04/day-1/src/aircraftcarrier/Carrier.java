package aircraftcarrier;

import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> aircrafts;
    int health;
    int storeOfAmmo;

    public Carrier(int health, int storeOfAmmo) {
        this.aircrafts = new ArrayList<>();
        this.health = health;
        this.storeOfAmmo = storeOfAmmo;
    }

    public void add(Aircraft inputAircraft) {
        aircrafts.add(inputAircraft);
    }

    public void fill() {
        if (storeOfAmmo > 0) {
            for (Aircraft inspectedAircraft : aircrafts) {
                if (storeOfAmmo <= 0) {
                    return;
                }
                if (inspectedAircraft.isPriority()) {
                    int temp = inspectedAircraft.ammunition;
                    inspectedAircraft.refill(storeOfAmmo);
                    storeOfAmmo -= inspectedAircraft.ammunition - temp;
                }
            }
            for (Aircraft inspectedAircraft : aircrafts) {
                if (storeOfAmmo <= 0) {
                    return;
                }
                int temp = inspectedAircraft.ammunition;
                inspectedAircraft.refill(storeOfAmmo);
                storeOfAmmo -= inspectedAircraft.ammunition - temp;
            }
        } else {
            throw new Error("The carrier has 0 Ammo stock so it cannot refill aircrafts");
        }
    }

    public void fight(Carrier attackedCarrier) {
        int carrierDamageDealt = 0;
        for (Aircraft inspectedAircraft : this.aircrafts) {
            carrierDamageDealt += inspectedAircraft.fight();
        }
        attackedCarrier.health -= carrierDamageDealt;
    }

    public void getStatus() {
        int totalDamage = 0;
        for (Aircraft inspectedAircraft : aircrafts) {
            totalDamage += inspectedAircraft.fightingpotential();
        }

        if (this.health <= 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + health + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + storeOfAmmo + ", Total damage: " + totalDamage);
            for (Aircraft inspectedAircraft : aircrafts) {
                System.out.println(inspectedAircraft.getStatus());
            }
        }
    }
}

