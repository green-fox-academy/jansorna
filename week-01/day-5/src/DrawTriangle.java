import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawTriangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me whole number:");
        int input = scanner.nextInt();

        int numberOfLine = 1;
        String star = "*";
        String line = "";

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < numberOfLine ; j++) {
                line += star;
                System.out.println(line);
            }
        }
        numberOfLine++;
    }
}
