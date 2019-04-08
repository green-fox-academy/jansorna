public class Factorial {
    public static void main(String[] args) {
        int givenParameter = 10;

        System.out.println(sum(givenParameter));
    }

    public static int sum (int x) {
        int y = 1;

        for (int i = 1; i <= x; i++) {
            y = y * i;
        }
        return y;
    }

    // - Create a function called `factorio`
    //   that returns it's input's factorial

}
