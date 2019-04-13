import java.util.HashMap;
import java.util.Map;

public class Productdatabase {

    public static void main(String[] args) {

        HashMap<String, Integer> productDatabase = new HashMap<>();

        productDatabase.put("Eggs", 200);
        productDatabase.put("Milk", 200);
        productDatabase.put("Fish", 400);
        productDatabase.put("Apples", 150);
        productDatabase.put("Bread", 50);
        productDatabase.put("Chicken", 550);

        application(productDatabase);
    }

    public static void application(HashMap<String, Integer> input) {

        int max = 0;
        int min = 0;
        String maxKey = "";
        String minKey = "";
        int sum = 0;
        int productCheaperThan300 = 0;

        System.out.println(input.get("Fish"));

        for (Map.Entry<String, Integer> product : input.entrySet()) {

            sum += product.getValue();

            if (product.getValue() > max) {
                min = product.getValue();
                max = product.getValue();
                maxKey = product.getKey();
            }

            if (product.getValue() < 300) {
                productCheaperThan300++;
            }

            if (product.getValue() == 125) {
                System.out.println("You can buy exactly for 125: " + product.getKey());
            }

            if (product.getValue() < min) {
                min = product.getValue();
                minKey = product.getKey();
            }
        }
        System.out.println("The most expensive product is: " + maxKey);
        System.out.println("The average price is: " + sum / input.size());
        System.out.println("There are " + productCheaperThan300 + " product(s) cheaper than 300");
        System.out.println("The cheapest product is: " + minKey);
    }
}
