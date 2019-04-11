public class Stringsagain {

    public static void main (String[] args) {

        String inputWord = "xXjfdofjodxxxxjojfx";
        int numberOfLetters = inputWord.length();
        int counter = 0;
        int removal = 0;

        System.out.println(stringChanger(inputWord, numberOfLetters, counter, removal));
    }

    public static String stringChanger(String word, int numberOfLetters, int number, int removalInitieted) {

        char x = 'x';

        if (number == numberOfLetters - removalInitieted) {

            return word;

        } else if (word.charAt(number) == x){

            removalInitieted += 1;

            return stringChanger((word.substring(0, number) + word.substring(number + 1)), numberOfLetters, number, removalInitieted);

        } else {

            return stringChanger(word, numberOfLetters, number + 1, removalInitieted);

        }
    }
}
