public class Summing {

    public static void main(String[] args) {
        int givenParameter = 3;

        System.out.println(sum(givenParameter));
    }

    public static int sum (int x) {
        int y = 0;

        for (int i = 0; i <= x; i++) {
            y = y + i;
        }
        return y;
    }

    // Create the usual class wrapper and main method on your own.

    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
}
