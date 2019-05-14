import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise7 {
    public static void main(String[] args) {
        String startingLetter = "N";
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        Stream<String> citiesStartsWithGivenLetter = cities.stream()
                .filter(city -> city.startsWith(startingLetter));
        System.out.println(citiesStartsWithGivenLetter.collect(Collectors.toList()));
    }
}
