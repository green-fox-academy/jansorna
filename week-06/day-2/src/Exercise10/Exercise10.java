package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        List<Fox> foxZoo = initializeZoo();

        List<Fox> greenFoxes = foxZoo.stream()
                .filter(fox -> fox.getColor() == "green")
                .collect(Collectors.toList());
        System.out.println(greenFoxes);

        List<Fox> greenFoxesYoungerThan5 = foxZoo.stream()
                .filter(fox -> fox.getColor() == "green" && fox.getAge() < 5)
                .collect(Collectors.toList());
        System.out.println(greenFoxesYoungerThan5);

        Map<String, Integer> foxesGroupedByColor = foxZoo.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.summingInt(c -> 1)));
        System.out.println(foxesGroupedByColor);
    }

    private static List<Fox> initializeZoo() {

        List<Fox> foxCrowd = new ArrayList<Fox>();

        Fox fox1 = new Fox("Peter", "blue", 30);
        Fox fox2 = new Fox("Albert", "green", 3);
        Fox fox3 = new Fox("Robert", "yellow", 18);
        Fox fox4 = new Fox("Philomina", "red", 5);
        Fox fox5 = new Fox("Barbora", "green", 70);
        Fox fox6 = new Fox("Mamlas", "pink", 52);
        Fox fox7 = new Fox("Kuldas", "silver", 29);

        foxCrowd.add(fox1);
        foxCrowd.add(fox2);
        foxCrowd.add(fox3);
        foxCrowd.add(fox4);
        foxCrowd.add(fox5);
        foxCrowd.add(fox6);
        foxCrowd.add(fox7);

        return foxCrowd;
    }
}
