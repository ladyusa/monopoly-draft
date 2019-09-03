package monopoly;

public class MGame {
    private static int N = 25;

    private int roundCnt;
    private Board board;
    private Player[] players;
    private Die[] dice;

    public void playGame() {
        for (roundCnt = 0; roundCnt < N; roundCnt++) {
            playRound();
        }
    }

    private void playRound() {
        for (int i = 0; i < players.length; i++) {
            players[i].takeTurn();
        }
    }

}
