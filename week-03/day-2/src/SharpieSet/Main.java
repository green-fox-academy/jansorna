package SharpieSet;

public class Main {
    public static void main(String[] args) {

        // start testing

        //creation of 3 instances - Sharpies
        Sharpie firstSharpie = new Sharpie("red", 10f);
        Sharpie secondSharpie = new Sharpie("blue", 50f);
        Sharpie thirdSharpie = new Sharpie("yellow", 25f);

        //creation of Sharpieset
        SharpieSet firstSharpieSet = new SharpieSet();

        //filling SharpieSet with Sahrpies
        firstSharpieSet.add(firstSharpie);
        firstSharpieSet.add(secondSharpie);
        firstSharpieSet.add(thirdSharpie);

        //filling out firstSharpie
        while (firstSharpie.inkAmount != 0) {
            firstSharpie.use();
        }

        //testing of countUsable() method
        System.out.println(firstSharpieSet.countUsable());

        //testing of removeThrash() method
        firstSharpieSet.removeThrash();

        for (Sharpie sh : firstSharpieSet.SharpieSet) {
            System.out.println(sh.color);
        }
        //end testing
        
    }
}
