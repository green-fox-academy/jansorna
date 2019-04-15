import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String filename) {

        Path filePath = Paths.get(filename);

        try {
            List<String> content = Files.readAllLines(filePath);

            //checking rows for X and O

            for (int i = 0; i < content.size(); i++) {
                for (int j = 0; j < content.size() - 2; j++) {
                    if (content.get(i).charAt(j) == 'X' && content.get(i).charAt(j + 1) == 'X' && content.get(i).charAt(j + 2) == 'X') {
                        return "X";
                    } else if (content.get(i).charAt(j) == 'O' && content.get(i).charAt(j + 1) == 'O' && content.get(i).charAt(j + 2) == 'O') {
                        return "O";
                    }
                }
            }

            // checking columns for X and O

            for (int i = 0; i < content.size() - 2; i++) {
                for (int j = 0; j < content.size(); j++) {
                    if (content.get(i).charAt(j) == 'X' && content.get(i + 1).charAt(j) == 'X' && content.get(i + 2).charAt(j) == 'X') {
                        return "X";
                    } else if (content.get(i).charAt(j) == 'O' && content.get(i + 1).charAt(j) == 'O' && content.get(i + 2).charAt(j) == 'O') {
                        return "O";
                    }
                }
            }

            // checking diagonals for X and O

            for (int i = 0; i < content.size() - 2; i++) {
                for (int j = 0; j < content.size() - 2; j++) {
                    if ((content.get(i).charAt(j) == 'X' && content.get(i + 1).charAt(j + 1) == 'X' && content.get(i + 2).charAt(j + 2) == 'X') || (content.get(i).charAt(j + 2) == 'X' && content.get(i + 1).charAt(j + 1) == 'X' && content.get(i + 2).charAt(j) == 'X')) {
                        return "X";
                    } else if ((content.get(i).charAt(j) == 'O' && content.get(i + 1).charAt(j + 1) == 'O' && content.get(i + 2).charAt(j + 2) == 'O') || (content.get(i).charAt(j + 2) == 'O' && content.get(i + 1).charAt(j + 1) == 'O' && content.get(i + 2).charAt(j) == 'O')) {
                        return "O";
                    }
                }
            }
        } catch (IOException e) {
            return "Failed to read the file";
        }
        return "Draw";
    }
}