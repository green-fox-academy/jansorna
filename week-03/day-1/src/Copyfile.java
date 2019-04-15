import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Copyfile {
    public static void main(String[] args) {

        String firstFile = "appleFile";
        String secondFile = firstFile + "v2";

        System.out.println(copyFiles(firstFile, secondFile));

        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
    }

    public static boolean copyFiles(String fromFile, String toFile) {

        try {
            Path fromFilePath = Paths.get(fromFile);
            Path toFilePath = Paths.get(toFile);

            List<String> content = Files.readAllLines(fromFilePath);

            Files.write(toFilePath, content);

            return true;

        } catch (IOException e) {
            System.out.println("Unable to write to new file");
            return false;
        }
    }
}
