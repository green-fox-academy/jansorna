import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    String inputString;
    HashMap<Character, Integer> dictionary;

    public CountLetters(String inputString) {
        this.inputString = inputString;
        dictionary = new HashMap<>();
    }

    public HashMap<Character, Integer> getOccurence(String inputString) {

        if (inputString.isEmpty()) {
            return null;
        }

        inputString = inputString.toUpperCase();
        char[] lettersOfTheStringInArray = inputString.toCharArray();

        for (int i = 0; i < lettersOfTheStringInArray.length; i++) {
            char actual = lettersOfTheStringInArray[i];
            int actualsOccurrences = 0;
            for (int j = 0; j < lettersOfTheStringInArray.length; j++) {
                if (lettersOfTheStringInArray[j] == actual) {
                    actualsOccurrences++;
                }
                dictionary.put(actual, actualsOccurrences);
            }
        }
        for (Map.Entry<Character, Integer> pageOfDictionary : dictionary.entrySet()) {
            System.out.println(pageOfDictionary.getKey() + " " + pageOfDictionary.getValue());
        }
        return dictionary;
    }

    public static void main(String[] args) {
    }
}
