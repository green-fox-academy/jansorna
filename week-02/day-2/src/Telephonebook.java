import java.util.HashMap;
import java.util.Map;

public class Telephonebook {

    public static void main (String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("William A. Lathan", "405-709-1865");
        map.put("John K. Miller", "402-247-8568");
        map.put("Hortensia E. Foster", "606-481-6467");
        map.put("Amanda D. Newland", "319-243-5613");
        map.put("Brooke P. Askew", "307-687-2982");

        application(map);
    }

    public static void application (HashMap<String, String> inputHashMap) {

        System.out.println(inputHashMap.get("John K. Miller"));

        for (Map.Entry<String, String> value : inputHashMap.entrySet()) {

            if (value.getValue() == "307-687-2982") {
                System.out.println(value.getKey());
            }
        }

        System.out.println(inputHashMap.get("Chris E. Myers"));

    }


}
