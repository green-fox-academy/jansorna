import java.util.ArrayList;
import java.util.Arrays;

public class Personalfinance {

    public static void main (String[] args) {

    ArrayList<Integer> expenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

    application(expenses);
    }

    public static void application (ArrayList<Integer> inputArray) {

        int moneyYouSpend = 0;
        int smallestExpense = inputArray.get(0);
        int biggestExpense = inputArray.get(0);

        for (Integer value: inputArray) {
            moneyYouSpend += value;

            if (smallestExpense > value) {
               smallestExpense = value;
           }
            if (biggestExpense < value){
               biggestExpense = value;
                }
            }

        double averageSpending = moneyYouSpend / inputArray.size();

        System.out.println("You spent in total: " + moneyYouSpend);
        System.out.println("The greatest expense was: " + biggestExpense);
        System.out.println("The cheaping expense was: " + smallestExpense);
        System.out.println("The average spending was: " + averageSpending);

        }
    }


