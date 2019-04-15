import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Writemultiplelines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please write a word: ");
        String word = sc.nextLine();

        System.out.println("Please write a name of new file: ");
        String path = sc.nextLine();

        System.out.println("Please write how much times the word should be stored in a new file");
        int number = sc.nextInt();

        writeToFileMultipleLines(path, word, number);

        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.

    }

    public static void writeToFileMultipleLines(String path, String word, int number) {

        try {
            Path filePath = Paths.get(path);
            List<String> content = new ArrayList<>();

            for (int i = 0; i < number; i++) {
                content.add(word);
            }
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Unable to write to new file");
        }
    }
}
