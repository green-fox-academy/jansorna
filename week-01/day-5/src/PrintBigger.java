import java.util.Scanner;

public class PrintBigger {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Give me another number:");

        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
        }
    }