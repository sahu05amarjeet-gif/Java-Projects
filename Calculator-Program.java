import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        System.out.println("===CALCULATOR===");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        
        boolean isRunning = true;
        while (isRunning){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the choice: ");
            int choice = input.nextInt();
            
            if (choice == 5){
                isRunning = false;
                System.out.println("Thanks for using");
                continue;
            }
            // Create a variable which is an object.
            System.out.print("Enter the first number: ");
            
            //Read the values inside the scanner.
            int first_num = input.nextInt();
            
            System.out.print("Enter the second number: ");
            int second_num = input.nextInt();
            
            if(choice == 1){
                int result = first_num + second_num;
                System.out.println("Result: " + result);
            } else if (choice == 2){
                int result = first_num - second_num;
                System.out.println("Result: " + result);
            } else if (choice == 3){
                int result = first_num * second_num;
                System.out.println("Result: " + result);
            } else if (choice == 4){
                int result = first_num / second_num;
                System.out.println("Result: " + result);
            }
            
        }
    }
}