import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theSearchedNumber = 16;

        for (int i = 0; i < 10000000; i++) {
            System.out.println("Try to guess the number:");
            int guessNumber = scanner.nextInt();

                if (guessNumber < theSearchedNumber){
                    System.out.println("The stored number is higher");
                } else if (guessNumber > theSearchedNumber){
                    System.out.println("The stored number is lower");
                } else {
                    System.out.println("You found the number: " + theSearchedNumber);
                    
                }
        }
    }
}