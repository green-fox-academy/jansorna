import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please give me a word: ");
        String firstWord = sc.nextLine();

        System.out.println("Please give me another word: ");
        String secondWord = sc.nextLine();

        checkingAnagram(firstWord, secondWord);
    }

    public static void checkingAnagram(String a, String b) {

        char[] firstArray = a.toCharArray();
        char[] secondArray = b.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("Input words are Anagrams");
        } else {
            System.out.println("Input words are not Anagrams");
        }
    }
}
