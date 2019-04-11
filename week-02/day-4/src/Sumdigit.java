public class Sumdigit {

    public static void main (String[] args) {

        int x = 126;
        System.out.println(sumDigit(x));

    }

    public static int sumDigit (int n) {

        if (n == 0){
            return 0;

        } else {

           return n %10 + sumDigit(n / 10);

        }

    }
}
