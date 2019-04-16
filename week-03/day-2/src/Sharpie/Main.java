package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie firstSharpie = new Sharpie("red", 10f);
        Sharpie secondSharpie = new Sharpie("blue", 50f);
        Sharpie thirdSharpie = new Sharpie("yellow", 25f);

        // start of testing
        System.out.println(firstSharpie.color + " " + secondSharpie.width + " " + thirdSharpie.inkAmount);
        secondSharpie.use();
        System.out.println(secondSharpie.inkAmount);
        // end of testing
    }
}
