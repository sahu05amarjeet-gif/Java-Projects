import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("===ROCK 🪨️ PAPER 📃️ SCISSOR ✂️ ===");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissor");
        System.out.println("4.Exit");
        boolean isRunning = true;
        int score = 0;
        int computer_score = 0;
        int draw = 0;
        Scanner input = new Scanner(System.in);
        // Computer's input
        String[] options = { "Rock", "Paper", "Scissor" };
        Random rand = new Random();
        int index = rand.nextInt(options.length);
        int answer = index + 1;
        while (isRunning) {
            // User input
            System.out.print("Choose: ");
            int userAnswer = input.nextInt();
            if (userAnswer == 4) {
                isRunning = false;
                System.out.println("Thanks for playing!🙏️");
                break;
            }
            if (userAnswer == answer) {
                System.out.println("It's a tie!");
                draw++;
            } else if (userAnswer == 1 && answer == 2) {
                System.out.println("You win!");
                score++;
            } else if (userAnswer == 2 && answer == 1) {
                System.out.println("You lose");
                score--;
                computer_score++;
            } else if (userAnswer == 2 && answer == 3) {
                System.out.println("You lose");
                score--;
                computer_score++;
            } else if (userAnswer == 3 && answer == 2) {
                System.out.println("You win!");
                score++;
            } else if (userAnswer == 1 && answer == 3) {
                System.out.println("You win");
                score++;
            } else if (userAnswer == 3 && answer == 1) {
                System.out.println("You lose!");
                score--;
                computer_score++;
            }
        }
        System.out.println("===RESULT===");
        System.out.println("You 🫵️ : " + score);
        System.out.println("Computer 💻️: " + computer_score);
        System.out.println("Draw 🏳️: " + draw);

    }
}
