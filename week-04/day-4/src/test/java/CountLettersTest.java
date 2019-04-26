import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
    String firstString;
    CountLetters myCountLetters = new CountLetters(firstString);
    char[] lettersOfTheStringInArray;
    HashMap<Character, Integer> exampleMap = new HashMap<>();

    @Before
    public void beforeMethod() {
        this.firstString = "Hello";
        lettersOfTheStringInArray = firstString.toCharArray();
        exampleMap.put('H', 1);
        exampleMap.put('E', 1);
    }

    @Test
    public void getOccurence_inputOneWord_toReturnAndPrintOutDictionary() {
        assertEquals(exampleMap, myCountLetters.getOccurence(firstString));
    }

    @Test
    public void getOccurence_inputOneWord_MapIsNotEmpty() {
        assertNotNull(myCountLetters.getOccurence(firstString));
    }
}
