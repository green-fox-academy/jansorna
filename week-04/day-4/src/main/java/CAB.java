public class CAB {
    int[] code;

    String cow = "cow";
    String bull = "bull";

    int cowCount;
    int bullCount;

    String stateOfTheGame = "Playing";

    public CAB(int[] code) {
        this.code = code;
    }

    public void guess(int first, int second, int third, int fourth) {
        cowCount = 0;
        bullCount = 0;

        int[] guessingNumber = {first, second, third, fourth};

        for (int j = 0; j < guessingNumber.length; j++) {
            for (int k = 0; k < guessingNumber.length; k++) {
                if (guessingNumber[j] == this.code[k] && j != k) {
                    bullCount++;
                } else if (guessingNumber[j] == this.code[k] && j == k) {
                    cowCount++;
                }
            }
        }
        System.out.println("Result: " + cowCount + " " + cow + ", " + bullCount + " " + bull);
        finished();
    }

    public void finished() {
        if (cowCount == 4) {
            System.out.println("You guessed the number!");
            setStateOfTheGame("Finished");
        }
    }

    public void setStateOfTheGame(String stateOfTheGame) {
        this.stateOfTheGame = stateOfTheGame;
    }

    public static void main(String[] args) {
    }
}
