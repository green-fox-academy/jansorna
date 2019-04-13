import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please give me a word: ");
        checkingAnagram(sc.nextLine());
    }

    public static void checkingAnagram(String a) {

        char[] word = a.toCharArray();

        for (int i = 0; i < word.length / 2; i++) {
            char temp = word[i];
            word[i] = word[word.length - 1 - i];
            word[word.length - 1 - i] = temp;
        }
        System.out.println("Palindrome of this word is: " + a + new String(word));
    }
}
