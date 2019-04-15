import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {

        // Create a method that decrypts reversed-order.txt

        String nameOfFile = "reversed-order.txt";

        decryptFromReversedOrder(nameOfFile);
    }

    public static void decryptFromReversedOrder(String nameOfFile) {
        Path filePath = Paths.get(nameOfFile);
        Path newFilePath = Paths.get("decrypted" + nameOfFile);

        try {
            List<String> content = Files.readAllLines(filePath);
            List<String> reversedContent = new ArrayList<>();

            for (int row = 0; row < content.size() / 2; row++) {
                String firstString = content.get(row);
                String secondString = content.get(content.size() - 1 - row);
                reversedContent.add(row, secondString);
                reversedContent.add(row + 1, firstString);
            }
            Files.write(newFilePath, reversedContent);
        } catch (IOException e) {
            System.out.println("Failed to read the file.");
        }
    }
}
