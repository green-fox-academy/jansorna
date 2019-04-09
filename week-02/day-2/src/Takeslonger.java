public class Takeslonger {

    public static void main(String[] args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        quote = fixer(quote);
        System.out.println(quote);
    }

    public static String fixer(String input) {
            String addingPart = "always takes longer than";
            int position = 20;

            return input.substring(0, 20) + " " + addingPart + " " + input.substring(21);
    }
}
