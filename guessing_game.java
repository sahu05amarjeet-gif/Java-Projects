import java.util.Scanner;
public class guessing_game{
    public static void main(String[] args){
        System.out.println("===JAVA NUMBER GUESSING GAME===");
        Scanner input_level = new Scanner(System.in);
        System.out.print("Choose the level (1: Easy 2: Medium 3: Difficult): ");
        int choose_level = input_level.nextInt();

        if (choose_level == 1){
            System.out.println("Difficulty: Easy 😏️");
            int lowest_value = 1;
            int highest_value = 50;
            int answer = 1 + (int)(Math.random() * ((50 - 1) + 1));
            int attempts = 0;
            boolean isRun = true;
            while (isRun) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your choice from %d %d: ".formatted(lowest_value, highest_value));
                int user_input = input.nextInt();
                if (user_input > highest_value || user_input < lowest_value){
                    System.out.println("Out of range");
                    System.out.println("Please select the number between %d %d".formatted(lowest_value, highest_value));
                } else if (user_input > answer){
                    System.out.println("Too High!");
                    attempts++;
                } else if (user_input < answer){
                    System.out.println("Too low");
                    attempts++;
                } else{
                    System.out.println("Correct!🤩️");
                    System.out.println("Attempts: " + attempts);
                    isRun = false;
                }
            }
        }
        if (choose_level == 2){
            System.out.println("Difficulty: Medium 💀️");
            int lowest_value = 1;
            int highest_value = 100;
            int answer = 1 + (int)(Math.random() * ((100 - 1) + 1));
            int attempts = 0;
            boolean isRunning = true;
            while (isRunning) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your choice from %d %d: ".formatted(lowest_value, highest_value));
                int user_input = input.nextInt();
                if (user_input > highest_value || user_input < lowest_value){
                    System.out.println("Out of range");
                    System.out.println("Please select the number between %d %d".formatted(lowest_value, highest_value));
                } else if (user_input > answer){
                    System.out.println("Too High!");
                    attempts++;
                } else if (user_input < answer){
                    System.out.println("Too low");
                    attempts++;
                } else{
                    System.out.println("Correct!🤩️");
                    System.out.println("Attempts: " + attempts);
                    isRunning = false;
                }
            }
        }
        if (choose_level == 3){
            System.out.println("Difficulty: Hard 😈️");
            int lowest_val = 1;
            int highest_val = 500;
            int ans = 1 + (int)(Math.random() * ((500 - 1) + 1));
            int attempt = 0;
            boolean isRun = true;
            while (isRun) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your choice from %d-%d: ".formatted(lowest_val, highest_val));
                int user_input = input.nextInt();
                if (user_input > highest_val || user_input < lowest_val){
                    System.out.println("Out of range");
                    System.out.println("Please select the number between %d-%d".formatted(lowest_val, highest_val));
                } else if (user_input > ans){
                    System.out.println("Too High!");
                    attempt++;
                } else if (user_input < ans){
                    System.out.println("Too low");
                    attempt++;
                } else{
                    System.out.println("Correct!🤩️");
                    System.out.println("Attempts: " + attempt);
                    isRun = false;
                }
                
            }

        }
    }
}
