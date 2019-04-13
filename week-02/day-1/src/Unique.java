import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static String unique(int[] a) {

        ArrayList<Integer> b = new ArrayList<>();

        for (int value : a) {
            if (b.contains(value)) {
            } else {
                b.add(value);
            }
        }
        return b.toString();
    }
}
