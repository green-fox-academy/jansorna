import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number:");
        int numberOfLines = scanner.nextInt();

        int weight = numberOfLines / 2;
        String sign = "*";
        String empty = " ";

        for (int i = 0; i <= weight; i++) {
            for (int column = 0; column < numberOfLines; column++) {
                if (column < weight - i || column > weight + i) {
                    System.out.print(empty);
                } else {
                    System.out.print(sign);
                }
            }
            System.out.println();
        }
        int k = 1;
        for (int row = weight + 1; row < numberOfLines; row++) {
            for (int colums = 0; colums < numberOfLines; colums++) {
                if (colums < (numberOfLines - k) && colums >= k) {
                    System.out.print(sign);
                } else {
                    System.out.print(empty);
                }
            }

            k += 1;
            System.out.println();
        }
    }
}