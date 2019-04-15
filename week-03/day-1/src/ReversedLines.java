import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {

        // Create a method that decrypts reversed-lines.txt

        String nameOfFile = "reversed-lines.txt";

        decryptFromReversedLines(nameOfFile);
    }

    public static void decryptFromReversedLines(String nameOfFile) {
        Path filePath = Paths.get(nameOfFile);

        try {
            List<String> content = Files.readAllLines(filePath);
            List<Character> decryptedContentAsCharList = new ArrayList<>();

            for (int row = 0; row < content.size(); row++) {
                for (int column = 0; column < content.get(row).length() - 1; column++) {
                    decryptedContentAsCharList.add(content.get(row).charAt(content.get(row).length() - 1 - column));
                }
            }

            for (int i = 0; i < decryptedContentAsCharList.size(); i++) {
                System.out.print(decryptedContentAsCharList.get(i));
            }
        } catch (IOException e) {
            System.out.println("Failed to read the file.");
        }
    }
}