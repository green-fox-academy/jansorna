import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squeredNumbers = numbers.stream()
                .filter(a -> a * a > 20)
                .collect(Collectors.toList());
        System.out.println(squeredNumbers);
    }
}
