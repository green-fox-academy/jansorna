import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<Character> charList = Arrays.asList('A','B','C','D','E');

        String concatenateListOfCharacters = charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(concatenateListOfCharacters);
    }
}
