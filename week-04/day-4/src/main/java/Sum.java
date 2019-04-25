import java.util.List;

public class Sum {

    List<Integer> inputNumbers;

    public Sum(List<Integer> inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public int sumOfNumbersInList() {

        if (inputNumbers == null){
            return 0;
        }

        int sum = 0;
        for (Integer number : inputNumbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
    }
}
