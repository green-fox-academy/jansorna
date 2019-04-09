import java.util.HashMap;

public class MapIntroduction1 {

    public static void main (String[] args) {

        HashMap <Integer, String > map = new HashMap<>();

        System.out.println(map.isEmpty());

        System.out.println("----------------------------");

        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");

        System.out.println(map.keySet());

        System.out.println("----------------------------");

        System.out.println(map.values());

        System.out.println("----------------------------");

        map.put(68, "D");

        System.out.println(map.values().size());

        System.out.println("----------------------------");

        System.out.println(map.get(99));

        System.out.println("----------------------------");

        map.remove(97);

        System.out.println(map.get(100));

        System.out.println("----------------------------");

        map.clear();

        System.out.println(map.isEmpty());

    }
}
