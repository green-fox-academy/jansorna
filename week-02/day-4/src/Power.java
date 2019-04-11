public class Power {

    public static void main (String[] args) {

        int base = 3;
        int n = 2;

        System.out.println(powerRecursive(base, n));
    }

    public static int powerRecursive (int base, int n) {

        if (n == 0) {
            return 1;
        } else {

            return base * powerRecursive(base, n -1);
        }
    }
}
