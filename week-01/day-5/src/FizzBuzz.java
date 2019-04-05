
public class FizzBuzz {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            boolean divisionby3 = ((i % 3) == 0);
            boolean divisionby5 = ((i % 5) == 0);
            boolean divisionby15 = divisionby5 && divisionby3;

            if (divisionby15) {
                System.out.println("FizzBuzz");
            } else if (divisionby3) {
                System.out.println("Fizz");
            } else if (divisionby5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.

    }

}
