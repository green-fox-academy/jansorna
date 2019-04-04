import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put th whole number: ");
        int number = scanner.nextInt();

        int leftover;
        leftover = (number %=2);

        if (leftover == 1){
            System.out.println("odd");
        }
            else {
            System.out.println("even");

        }
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

    }
}
