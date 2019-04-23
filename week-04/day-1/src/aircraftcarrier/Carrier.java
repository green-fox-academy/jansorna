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
            while (storeOfAmmo > 0) {
                for (Aircraft inspectedAircraft : aircrafts) {
                    if (inspectedAircraft.isPriority()) {
                        inspectedAircraft.refill(storeOfAmmo);
                        storeOfAmmo -= inspectedAircraft.refill(storeOfAmmo); //sem se vr9tit
                    }
                }
                for (Aircraft inspectedAircraft : aircrafts) {
                    inspectedAircraft.refill(storeOfAmmo);
                }
            }
        } else {
            throw new Error("The carrier has 0 Ammo stock so it cannot refill aircrafts");
        }
    }

    public void fight(Carrier attackiedCarrier) {
        int carrierDamageDealt = 0;
        for (Aircraft inspectedAircraft : aircrafts) {
            carrierDamageDealt += inspectedAircraft.fight();
        }
        attackiedCarrier.health -= carrierDamageDealt;
    }

    public void getStatus() {

        if (this.health <= 0) {
            System.out.println("It's dead Jim :(");
        }

        int totalDamage = 0;
        for (Aircraft inspectedAircraft : aircrafts) {
            totalDamage += inspectedAircraft.fightingpotential();
        }

        System.out.println("HP: " + health + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + storeOfAmmo + ", Total damage: " + totalDamage);
        for (Aircraft inspectedAircraft : aircrafts) {
            System.out.println(inspectedAircraft.getStatus());
        }
    }
}

