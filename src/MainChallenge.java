//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final Score is, " + finalScore);
        }

        boolean gameOver1 = true;
        int score1 = 10000;
        int levelCompleted1 = 8;
        int bonus1= 200;
        int finalScore1 = score;

        if(gameOver1){
            finalScore += (levelCompleted1 * bonus);
            System.out.println("Your final Score is, " + finalScore1);
        }
    }
}