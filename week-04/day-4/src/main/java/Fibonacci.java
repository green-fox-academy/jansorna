public class Fibonacci {
    int fibonacciIndex;

    public Fibonacci(int fibonacciIndex) {
        this.fibonacciIndex = fibonacciIndex;
    }

    public int fibonacciRecursive(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
    }

}

