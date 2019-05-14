import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> squeredNumbers = numbers.stream()
                .filter(a -> a > 0)
                .map(a -> a * a)
                .collect(Collectors.toList());
        System.out.println(squeredNumbers);
    }
}