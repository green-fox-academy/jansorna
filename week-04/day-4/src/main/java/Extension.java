import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Extension {

    public int add(int a, int b) {
        return a + b;
    }

    public int maxOfThree(int a, int b, int c) {
        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    public int median(List<Integer> pool) {
        Collections.sort(pool);
        return pool.get((pool.size() - 1) / 2);
    }

    public boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i', 'y').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i += 2;
                length += 2;
            }
        }
        return teve;
    }

    public static void main(String[] args) {

    }
}