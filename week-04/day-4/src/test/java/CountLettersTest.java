import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
    String firstString;
    CountLetters myCountLetters = new CountLetters(firstString);
    char[] lettersOfTheStringInArray;

    @Before
    public void beforeMethod(){
        this.firstString = "Hello";
        lettersOfTheStringInArray = firstString.toCharArray();

    }

    @Test
    public void getOccurence_inputOneWord_toReturnAndPrintOutDictionary() {
        assertNotNull(myCountLetters.getOccurence(firstString));
    }
}
