import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Countlines {
    public static void main(String[] args) {
        String nameOfTheFile = "newTextFile.txt";

        System.out.println(countLines(nameOfTheFile));

    }

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    public static int countLines(String nameOfFile) {

        Path filePath = Paths.get("newTextFile.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (
                IOException e) {
            return 0;
        }
    }
}
