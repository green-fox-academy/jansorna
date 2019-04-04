import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put the distance in km: ");

        int userInput2 = scanner.nextInt();

        double kmandmileconventer;
        kmandmileconventer =(0.621371192);

        double distanceInMiles;
        distanceInMiles = userInput2 * kmandmileconventer;

        System.out.println(userInput2 + "km is " + distanceInMiles + " miles");

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
