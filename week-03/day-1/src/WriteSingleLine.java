import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write you name: ");
        String singleLine = sc.nextLine();

        writeToFile(singleLine);

        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

    }

    public static void writeToFile(String singleLine) {

        try {
            Path filePath = Paths.get("my-file.txt");
            List<String> content = new ArrayList<>();
            content.add (singleLine);
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}