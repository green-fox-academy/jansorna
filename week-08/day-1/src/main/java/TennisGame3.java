import static java.lang.Math.abs;

public class TennisGame3 implements TennisGame {

    private int player1Score;
    private int player2Score;
    public String player1Name;
    public String player2Name;
    private String[] scoreTable;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.scoreTable = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    }

    public String getScore() {

        if (checkIfLessFourthy()) {
            return (whatJudgeSaysBeforeFourthy());
        } else {
            if (checkIfEqual()) {
                return "Deuce";
            } else {
                return whatJudgeSaysAfterFourthy();
            }
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name) {
            this.player1Score += 1;
        } else {
            this.player2Score += 1;
        }
    }

    public boolean checkIfLessFourthy() {
        return player1Score < 4 && player2Score < 4;
    }

    public boolean checkIfEqual() {
        return player1Score == player2Score;
    }

    public String whatJudgeSaysBeforeFourthy() {
        if (checkIfEqual()) {
            return scoreTable[player1Score] + "-All";
        } else {
            return scoreTable[player1Score] + "-" + scoreTable[player2Score];
        }
    }

    public String getWinningPlayer() {
        return player1Score > player2Score ? player1Name : player2Name;
    }

    public String whatJudgeSaysAfterFourthy() {
        return (abs(player1Score - player2Score) == 1) ? "Advantage " + getWinningPlayer() : "Win for " + getWinningPlayer();
    }
}
