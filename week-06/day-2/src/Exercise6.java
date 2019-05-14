import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        String exampleString = "FamUheChostKfkfklSTksRIhfhNsjGosS";

        String capitalLetters = exampleString.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char)c))
                .collect(Collectors.joining());
        System.out.println(capitalLetters);
    }
}
