public class Bunniesagain {

    public static void main (String[] args) {
        int numberOfBunniesOverall = 6;
        int numberOfEarsOdd = 3;
        int numberOfEarsEven = 2;

        System.out.println(earsCalculator(numberOfBunniesOverall, numberOfEarsOdd, numberOfEarsEven));
    }

    public static int earsCalculator(int bunnies, int earsOdd, int earsEven) {

        if (bunnies == 0) {
            return 0;
        } else if (bunnies %2 == 0) {

            return earsEven + earsCalculator(bunnies - 1, earsOdd, earsEven);

        } else {
            return earsOdd + earsCalculator(bunnies - 1, earsOdd, earsEven);
        }
    }
}