import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    String firstString;
    String secondString;
    String thirdString;
    String fourthString;

    Anagram myAnagram = new Anagram(firstString, secondString);
    Anagram myAnagram2 = new Anagram(thirdString, fourthString);

    @Before
    public void beforeMethod(){
        this.firstString = "hello";
        this.secondString = "oellh";
        this.thirdString = "pivo";
        this.fourthString = "vino";
    }

    @Test
    public void checkingIfWordsAreAnagrams_inputTwoAnagrams_toWorkProperly(){
        assertTrue(myAnagram.checkingIfWordsAreAnagrams(firstString,secondString));
    }

    @Test
    public void checkingIfWordsAreAnagrams_inputTwoNulls_toWorkProperly(){
        assertFalse(myAnagram.checkingIfWordsAreAnagrams(null,null));
    }

    @Test
    public void checkingIfWordsAreAnagrams_inputTwoNonAnagrams_toWorkProperly(){
        assertFalse(myAnagram2.checkingIfWordsAreAnagrams(thirdString,fourthString));
    }
}
