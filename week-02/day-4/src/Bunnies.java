public class Bunnies {

    public static void main (String[] args) {
        int numberOfBunnies = 200;
        int numberOfEars = 2;

        System.out.println(earsCalculator(numberOfBunnies, numberOfEars));
    }

    public static int earsCalculator(int bunnies, int ears) {

        if (bunnies == 0) {
            return 0;
        } else {
            return ears + earsCalculator(bunnies - 1, ears);
        }
    }
}