public class Stringsagainandagain {

    public static void main (String[] args) {

        String inputWord = "This is a hell exercise and I have no clue how i did that!";
        int numberOfLetters = inputWord.length();
        int counter = 0;
        int adder = 0;

        System.out.println(stringChanger(inputWord, numberOfLetters, counter, adder));
    }

    public static String stringChanger(String word, int numberOfLetters, int position, int adderInitilited) {

        char x = '*';

        if (position == numberOfLetters + adderInitilited) {

            return word;

        } else if (word.charAt(position) != x){

            adderInitilited += 1;

            return stringChanger((word.substring(0, position + 1) + x + word.substring(position + 1)), numberOfLetters, position  + 2, adderInitilited);

        } else {

            return stringChanger(word, numberOfLetters, position + 1, adderInitilited);
        }
    }
}