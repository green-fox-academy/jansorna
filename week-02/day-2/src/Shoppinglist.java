import java.util.ArrayList;
import java.util.Arrays;

public class Shoppinglist {

    public static void main (String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));

        application(shoppingList);
    }

    public static void application (ArrayList<String> inputArray) {

        if (inputArray.contains("milk")) {
            System.out.println("Milk is listed.");
        } else {
            System.out.println("Milk is not listed.");
        }

        if (inputArray.contains("bananas")) {
            System.out.println("Bananas are listed");
        } else {
            System.out.println("Bananas are not listed");
        }
    }
}

