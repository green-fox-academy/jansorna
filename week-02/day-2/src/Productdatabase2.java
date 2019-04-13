import java.util.HashMap;
import java.util.Map;

public class Productdatabase2 {

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

        for (Map.Entry<String, Integer> product : input.entrySet()) {
            if (product.getValue() < 201) {
                System.out.println(product.getKey());
            }
        }

        for (Map.Entry<String, Integer> product : input.entrySet()) {
            if (product.getValue() > 150) {
                System.out.println(product.getKey() + " " + product.getValue());
            }
        }
    }
}
