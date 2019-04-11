import java.lang.reflect.Array;

public class Fibonacci {

    public static void main (String[] args) {

        int howMuchTimes = 10;

        for (int i = 0; i <= howMuchTimes - 1; i++) {

            System.out.print(fibonacciRecursive(i) + ", ");

        }

    }

    public static int fibonacciRecursive (int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0){
            return 0;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }
}
