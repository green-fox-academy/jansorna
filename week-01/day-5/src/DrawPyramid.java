import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        System.out.println("Please give me whole number:");
        int linesPerSection = scanner.nextInt();

        int topIncrement = 2;
        String leafesSign = "*";
        String emptySign = " ";

        int width = 1 + ((linesPerSection - 1) * 2);
        int middle = width / 2;


        String line = "";
        int addedSigns = 0;

            for (int rowCounter = 0; rowCounter < linesPerSection; rowCounter++) {
                line = "";
                for (int columnCounter = 0; columnCounter < width; columnCounter++) {
                    if (columnCounter < middle - addedSigns) {
                        line += emptySign;
                    } else if (columnCounter < middle + 1 + addedSigns){
                        line += leafesSign;
                    }
                }
                addedSigns += 1;
                System.out.println(line);
            }

    }
}