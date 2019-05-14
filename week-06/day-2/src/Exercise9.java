import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        String exampleString = "FamUheChostKfkfklSTksRIhfhNsjGosS";

        Map<Character, Integer> characterIntegerMap = exampleString.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
        System.out.println(characterIntegerMap);
    }
}
