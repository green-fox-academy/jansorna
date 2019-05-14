package Exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise11 {
    public static void main(String[] args) {
        List<String> content = readTheFile();

        Map<String, Integer> wordOccupancies = content.stream()
                .flatMap(str -> Arrays.stream(str.split("\\s")))
                .map(gg -> gg.replaceAll("[^a-zA-Z ]", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));

        wordOccupancies.entrySet().stream()
                .limit(100)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .filter(map -> !"".equals(map.getKey()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    private static List<String> readTheFile() {

        List<String> content = new ArrayList<>();
        Path filePath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-06\\day-2\\src\\Exercise11\\wiki.txt");

        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Oops, something wrong happened with the file!");
        }
        return content;
    }
}
