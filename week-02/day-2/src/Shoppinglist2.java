import java.util.HashMap;
import java.util.Map;

public class Shoppinglist2 {

    public static void main(String[] args) {

        HashMap<String, Double> productDatabase = new HashMap<>();

        productDatabase.put("Eggs", 3.14);
        productDatabase.put("Milk", 1.07);
        productDatabase.put("Rice", 1.59);
        productDatabase.put("Apples", 2.31);
        productDatabase.put("Cheese", 12.60);
        productDatabase.put("Chicken Breast", 9.40);
        productDatabase.put("Tomato", 2.58);
        productDatabase.put("Potato", 1.75);
        productDatabase.put("Onion", 1.10);

        HashMap<String, Integer> bobList = new HashMap<>();

        bobList.put("Milk", 3);
        bobList.put("Rice", 2);
        bobList.put("Apples", 1);
        bobList.put("Cheese", 1);
        bobList.put("Chicken Breast", 4);
        bobList.put("Tomato", 2);
        bobList.put("Potato", 1);
        bobList.put("Eggs", 2);

        HashMap<String, Integer> aliceList = new HashMap<>();

        aliceList.put("Rice", 1);
        aliceList.put("Apples", 1);
        aliceList.put("Chicken Breast", 2);
        aliceList.put("Tomato", 10);
        aliceList.put("Eggs", 5);

        application(productDatabase, bobList, aliceList);
    }

    public static void application(HashMap<String, Double> products, HashMap<String, Integer> bob, HashMap<String, Integer> alice) {

        double bobCosts = 0;
        double aliceCosts = 0;

        for (Map.Entry<String, Integer> bobProducts : bob.entrySet()) {
            for (Map.Entry<String, Double> eachProduct : products.entrySet()) {
                if (bobProducts.getKey().equals(eachProduct.getKey())) {
                    bobCosts += bobProducts.getValue() * eachProduct.getValue();
                }
            }
        }

        for (Map.Entry<String, Integer> aliceProducts : alice.entrySet()) {
            for (Map.Entry<String, Double> eachProduct : products.entrySet()) {
                if (aliceProducts.getKey().equals(eachProduct.getKey())) {
                    aliceCosts += aliceProducts.getValue() * eachProduct.getValue();
                }
            }
        }

        System.out.println("Bob will pay: " + bobCosts);
        System.out.println("Alice will pay: " + aliceCosts);

        for (Map.Entry<String, Integer> bobProducts : bob.entrySet()) {
            if (bobProducts.getKey().equals("Rice")) {
                for (Map.Entry<String, Integer> aliceProduct : alice.entrySet()) {
                    if (aliceProduct.getKey().equals("Rice")) {
                        if (bobProducts.getValue() > aliceProduct.getValue()) {
                            System.out.println("Bob buys more Rice");
                        } else {
                            System.out.println("Alice buys more Rice");
                        }
                    }
                }
            }
        }

        int notPotatoesInAliceList = 0;

        for (Map.Entry<String, Integer> bobProducts : bob.entrySet()) {
            if (bobProducts.getKey().equals("Potato")) {
                for (Map.Entry<String, Integer> aliceProduct : alice.entrySet()) {
                    if (aliceProduct.getKey().equals("Potato")) {
                        if (bobProducts.getValue() > aliceProduct.getValue()) {
                            System.out.println("Bob buys more Potatoes");
                        } else {
                            System.out.println("Alice buys more Potatoes");
                        }
                    } else {
                        notPotatoesInAliceList++;
                    }
                }
            }
        }

        if (notPotatoesInAliceList > 0) {
            System.out.println("Bob buys more Potatoes");
        }

        if (bob.size() > alice.size()) {
            System.out.println("Bob buys more different product");
        } else {
            System.out.println("Alice buys more different product");
        }

        int bobPieces = 0;
        int alicePieces = 0;

        for (Map.Entry<String, Integer> bobProducts : bob.entrySet()) {
            bobPieces += bobProducts.getValue();
        }

        for (Map.Entry<String, Integer> aliceProducts : alice.entrySet()) {
            alicePieces += aliceProducts.getValue();
        }

        if (bobPieces > alicePieces) {
            System.out.println("Bob have more pieces in his list");
        } else {
            System.out.println("Alice have more pieces in his list");
        }
    }
}
