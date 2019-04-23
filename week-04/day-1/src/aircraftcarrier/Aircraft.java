package aircraftcarrier;

public abstract class Aircraft {
    int ammunition = 0;
    int maxAmmo;
    int baseDamage;
    String type;

    public int fight() {
        int damageDealt = ammunition * baseDamage;
        ammunition = 0;
        return damageDealt;
    }

    public int fightingpotential() {
        int potentialDamage = ammunition * baseDamage;
        return potentialDamage;
    }

    public int refill(int ammoReffilling) {

        for (int i = 0; i < ammoReffilling; i++) {
            if (ammoReffilling > 0) {           //sem se vratit
                if (ammunition < maxAmmo) {
                    ammunition++;
                    ammoReffilling--;
                }
            }
        }
        return ammoReffilling;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type: " + type + ", Ammo: " + ammunition + ", Base Damage: " + baseDamage + ", All damage: " + (ammunition * baseDamage);
    }

    public boolean isPriority() {
        if (type == "F35") {
            return true;
        }
        return false;
    }
}
