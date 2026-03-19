//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainChallenge {
    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + "managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int playersScore){
        if (playersScore >= 1000){
            return  1;
        }
        else if (playersScore >= 500 && playersScore < 1000){
            return 2;
        }
        else if (playersScore >= 100 && playersScore < 500){
            return 3;
        }
        else {
            return 4;

        }
    }

    public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);

        }
        return finalScore;

    }
    public static void main(String[] args) {


//        System.out.print("Final score is: " + calculateScore(true, 800, 5, 100));
//
//        calculateScore(true, 10000, 8,200);
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Praise", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Favour", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("lisa", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Faith", highScorePosition);
        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Bob", highScorePosition);




    }
}