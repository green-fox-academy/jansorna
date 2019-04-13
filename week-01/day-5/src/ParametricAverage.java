import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me how much numbers you have:");
        int howMuchTimes = scanner.nextInt();

        System.out.println("Now I will ask you for each of them.");

        int[] basket = new int[howMuchTimes];
        int sum = 0;

        for (int i = 0; i < howMuchTimes; i++) {
            System.out.println("Please give me whole number:");
            int temp = scanner.nextInt();
            basket[i] = temp;
        }

        for (int i = 0; i < basket.length; i++) {
            sum += basket[i];
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / basket.length);
    }
}