public class Numberadder {

    public static void main (String[] args) {

        int x = 5;
        System.out.println(recursiveAdder (x));
    }

    public static int recursiveAdder (int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + recursiveAdder(n - 1);
        }
    }
}
