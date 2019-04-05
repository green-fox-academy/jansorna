import java.util.Scanner;

public class AverageOfInput {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please give me second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please give me third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Please give me fourth number: ");
        int fourthNumber = scanner.nextInt();
        System.out.println("Please give me fifth number: ");
        int fifthNumber = scanner.nextInt();

        int sum = fifthNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        int average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
