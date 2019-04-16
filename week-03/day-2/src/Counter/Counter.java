package Counter;

public class Counter {
    int inputNumber;
    int originalNumber;

    public Counter() {

    }

    public Counter(int inputNumber) {
        this.inputNumber = inputNumber;
        originalNumber = inputNumber;
    }

    public int add(int number) {
        return inputNumber = inputNumber + number;
    }

    public int add() {
        return inputNumber++;
    }

    public int get() {
        return inputNumber;
    }

    public int reset() {
        return inputNumber = originalNumber;
    }
}
