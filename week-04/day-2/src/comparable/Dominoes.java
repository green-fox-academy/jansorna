package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        Collections.sort(dominoes);
        System.out.println(dominoes);

        List<Thing> things = initializeThings();
        Collections.sort(things);
        System.out.println(things);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(5, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static List<Thing> initializeThings() {
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Clean the room", true));
        things.add(new Thing("Buy the dinner", false));
        things.add(new Thing("Wash up", true));
        things.add(new Thing("Watch videos", false));
        things.add(new Thing("Sleep", false));
        things.add(new Thing("Enjoy the life", true));
        return things;
    }
}