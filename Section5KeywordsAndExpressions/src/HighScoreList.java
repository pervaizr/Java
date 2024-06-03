public class HighScoreList {

     /* int highScorePosition = calculateHighScoreList(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScoreList(999);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScoreList(499);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScoreList(99);
        displayHighScorePosition("Ore", highScorePosition);

        highScorePosition = calculateHighScoreList(-1000);
        displayHighScorePosition("King", highScorePosition); */

    public static int calculateHighScoreList(int playerScore) {
        int postion = (playerScore >= 1000) ? 1 : (playerScore > 500) ? 2 : (playerScore > 100) ? 3 : 4;


        /*
        int score = playerScore;
        int postion = 4;

        if (score >= 1000) {
            postion = 1;

        } else if (score >= 500) {
            postion = 2;

        } else if (score >= 100) {
            postion = 3;

        } */
        return postion;
    }
}
