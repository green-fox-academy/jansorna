public class zapiskyKoduPrvniTyden {
}

// Print the Body mass index (BMI) based on these values

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double BMI = massInKg/(Math.pow(heightInM, 2));
        System.out.println(BMI + "%");
    }
}

// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put th whole number: ");
        int number = scanner.nextInt();

        int leftover;
        leftover = (number %=2);

        if (leftover == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }

    }
}

//Ruzne operace s variables

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;

        a += 10;

        // make the "a" variable's value bigger by 10

        System.out.println(a);

        int b = 100;

        b -= 7;

        // make b smaller by 7

        System.out.println(b);

        int c = 44;

        c *=2;

        // please double c's value

        System.out.println(c);

        int d = 125;

        d /=5;

        // please divide by 5 d's value

        System.out.println(d);

        int e = 8;

        double ecubed = Math.pow(e,3);

        // please cube of e's value

        System.out.println(ecubed);

        int f1 = 123;
        int f2 = 345;

        boolean efs = (f1 > f2);
        System.out.println(efs);

        // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;

        boolean gs = (g2*2 > g1);
        System.out.println(gs);

        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;

        double newh = h %=11;

        boolean divisor = (newh == 0);
        System.out.println(divisor);

        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;

        double i2Squared = Math.pow(i2,2);
        double i2Cubed = Math.pow(i2,3);

        boolean result = ((i2Squared < i1) && (i1 < i2Cubed));
        System.out.println(result);

        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;

        double division3 = (j %=3);
        double division5 = (j %=5);

        boolean divBy3 = (division3 == 0);
        boolean divBy5 = (division5 == 0);

        boolean k = (divBy3 || divBy5);

        // tell if j is dividable by 3 or 5 (print as a boolean)

        System.out.println(k);
    }
}


// změny variables

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        // if a is even increment out by one

        if ((a % 2) == 0) {
            System.out.println(++out);
        } else {
            System.out.println(out);
        }

        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if ((10 < b) && (b < 20)) {
            out2 = "Sweet";
        } else if (b < 10) {
            out2 = "Less!";
        } else {
            out2 = "More!";
        }

        System.out.println(out2);



        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        if ((credits >= 50) && (isBonus == false)) {
            c -= 2;
        } else if ((credits < 50) && (isBonus == false)) {
            c -= 1;
        } else if (isBonus == true) {
            c = c;
        }

        System.out.println(c);




        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        if ((d % 4 == 0) && (time <= 200)) {
            out3 = "check";
        } else if (time > 200) {
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }


        System.out.println(out3);
    }
}


// Count from input to input

import java.util.Scanner;

public class CountFromTo {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me number:");

        int firstNumber = scanner.nextInt();

        System.out.println("Give me another number:");

        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The second number should be bigger");
        }

        else {

            for (firstNumber = firstNumber; firstNumber <= secondNumber; firstNumber++) {
                System.out.println(firstNumber);
            }

        }
    }
}


//draw chesss table

public class DrawChessTable {

    public static void main(String[] args) {

        int numberOfLine = 2;
        String sign = "%";
        String emptySign = " ";
        String line = "";

        for (int i = 0; i < 8; i++) {
            line = "";
            boolean oddOrEven = (i %2 == 0);
            if (oddOrEven) {
                line = "% % % % % % % %";
            } else {
                line = " % % % % % % % ";
            }
            System.out.println(line);
        }
    }
}

//draw diagonal in a square

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

//draw diamond

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

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

// draw diamond

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

// draw triangle

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

//FizzBuzz

public class FizzBuzz {

    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            boolean divisionby3 = ((i % 3) == 0);
            boolean divisionby5 = ((i % 5) == 0);
            boolean divisionby15 = divisionby5 && divisionby3;

            if (divisionby15) {
                System.out.println("FizzBuzz");
            } else if (divisionby3) {
                System.out.println("Fizz");
            } else if (divisionby5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}

// guess the number

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


// party indicator

import java.util.Scanner;

public class PartyIndicator<numberOfGirls> {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the number of coming girls to the party: ");
        int numberOfGirls = scanner.nextInt();

        System.out.println("Please give me the number of coming boys to the party: ");
        int numberOfBoys = scanner.nextInt();

        double ratioOfGirlsAndBoys = (double) numberOfGirls / numberOfBoys;

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

    }
}

