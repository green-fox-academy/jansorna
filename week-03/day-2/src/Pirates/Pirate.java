package Pirates;

public class Pirate {
    boolean dead = false;
    static int pirateCounter;
    String name;
    String rank = "Ordinary";
    int consumedRum;
    boolean passedOut = false;

    public Pirate() {
        pirateCounter++;
        this.name = "Pirate" + pirateCounter;
    }

    public void drinkSomeRum() {
        consumedRum += (1 + Math.random()) * 10;
    }


    public void howsItGoingMate() {
        if (dead) {
            System.out.println("He`s dead!");
        } else if (consumedRum > 0) {
            System.out.println("Pour me anudder! " + "Pour me anudder! " + "Pour me anudder! " + "Pour me anudder! ");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
        }
    }

    public void die() {
        dead = true;
    }

    public void promotion() {
        rank = "Captain";
    }

    public void brawl(Pirate challengedPirate) {
        if (dead) {
            System.out.println("He`s dead!");
        } else {
            double resultOfBrawl = Math.random();
            if (resultOfBrawl < 0.33) {
                die();
            } else if (resultOfBrawl < 0.66) {
                challengedPirate.dead = true;
            } else {
                die();
                challengedPirate.dead = true;
            }
        }
    }

    @Override
    public String toString() {
        return (name + ", Rank: " + rank + ", Consumed rum: " + consumedRum + ", State (passed out/dead): " + passedOut + "/" + dead);
    }

}
