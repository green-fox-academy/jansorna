import java.util.Scanner;

public class DrawDiagonal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me whole number:");
        int numberOfLines = scanner.nextInt();

        String line = "";
        String sign = "%";
        String emptysign = " ";
        int numberOfColumn = 0;

        for (int i = 0; i < numberOfLines ; i++) {
            line = "";
            if (i == 0 | i == numberOfLines - 1) {
                for (int j = 0; j < numberOfLines; j++) {
                    line += sign;
                }
                System.out.println(line);
            } else {
                line = "";
                numberOfColumn++;
                for (int j = 0; j < numberOfLines; j++) {
                    if (j == 0 | j == numberOfLines - 1 | j == numberOfColumn) {
                        line += sign;
                    } else {
                        line += emptysign;
                    }
                }
                System.out.println(line);
            }
        }
    }
}