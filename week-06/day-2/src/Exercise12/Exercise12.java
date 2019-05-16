package Exercise12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> content = readTheFile();

        List<String> heaviestCharacter = content.stream()
                .flatMap(str -> Arrays.stream(str.split(";")))
                .collect(Collectors.toList())
                .stream()
                //donno how to do it
    }

    private static List<String> readTheFile() {

        List<String> content = new ArrayList<>();
        Path filePath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-06\\day-2\\src\\Exercise12\\swcharacters.txt");

        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Oops, something wrong happened with the file!");
        }
        return content;
    }
}
