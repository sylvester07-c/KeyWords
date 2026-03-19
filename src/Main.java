//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000 but greater than 1000");
        } else if (score > 3000) {
            System.out.println("Score is greater than 3000");

        } else {
            System.out.println("Out of bounds");
        }
    }
}