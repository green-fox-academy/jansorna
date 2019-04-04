public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;

        a += 10;

        // make the "a" variable's value bigger by 10

        System.out.println(a);

        int b = 100;

        b -= 7;

        // make b smaller by 7

        System.out.println(b);

        int c = 44;

        c *=2;

        // please double c's value

        System.out.println(c);

        int d = 125;

        d /=5;

        // please divide by 5 d's value

        System.out.println(d);

        int e = 8;

        double ecubed = Math.pow(e,3);

        // please cube of e's value

        System.out.println(ecubed);

        int f1 = 123;
        int f2 = 345;

        boolean efs = (f1 > f2);
        System.out.println(efs);

        // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;

        boolean gs = (g2*2 > g1);
        System.out.println(gs);

        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;

        double newh = h %=11;

        boolean divisor = (newh == 0);
        System.out.println(divisor);

        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;

        double i2Squared = Math.pow(i2,2);
        double i2Cubed = Math.pow(i2,3);

        boolean result = ((i2Squared < i1) && (i1 < i2Cubed));
        System.out.println(result);

        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;

        double division3 = (j %=3);
        double division5 = (j %=5);

        boolean divBy3 = (division3 == 0);
        boolean divBy5 = (division5 == 0);

        boolean k = (divBy3 || divBy5);

        // tell if j is dividable by 3 or 5 (print as a boolean)

        System.out.println(k);
    }
}