import java.util.Scanner;

public class PartyIndicator<numberOfGirls> {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the number of coming girls to the party: ");
        int numberOfGirls = scanner.nextInt();

        System.out.println("Please give me the number of coming boys to the party: ");
        int numberOfBoys = scanner.nextInt();

        double ratioOfGirlsAndBoys = numberOfGirls / numberOfBoys;

        if (numberOfGirls == 0) {

            System.out.println("Sausage party - bring PC and more beer!");

        }
        else if ((numberOfGirls + numberOfBoys >= 20) && ((ratioOfGirlsAndBoys == 1.00))) {

            System.out.println("The party is excellent!");

        }
        else if (numberOfGirls + numberOfBoys >= 20) {

            System.out.println("The party is excellent!");
            System.out.println("Quite cool party!");

        }

        else {
            System.out.println("Average party...");
        }

        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
    }
}