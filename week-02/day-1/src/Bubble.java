import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static String bubble(int[] a) {

        Arrays.sort(a);

        String ascending = Arrays.toString(a);
        return ascending;
    }

    public static String advancedBubble(int[] b, boolean x) {

        Arrays.sort(b);

        if (x) {
            for (int i = 0; i < b.length / 2; i++) {
                int temp = b[i];
                b[i] = b[b.length - 1 - i];
                b[b.length - 1 - i] = temp;
            }
            String descending = Arrays.toString(b);
            return descending;
        } else {
            String ascending = Arrays.toString(b);
            return ascending;
        }
    }
}