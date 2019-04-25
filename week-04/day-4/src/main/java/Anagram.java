import java.util.Arrays;

public class Anagram {
    String firstWord;
    String secondWord;

    public Anagram(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public boolean checkingIfWordsAreAnagrams(String a, String b) {

        if (a == null || b == null){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] firstArray = a.toCharArray();
        char[] secondArray = b.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (Arrays.equals(firstArray, secondArray)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }
}