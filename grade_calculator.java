import java.util.Scanner;
public class grade_calculator{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int total_subject = input.nextInt();

        int[] marks = new int[total_subject];
        int total = 0;
        for (int i=0; i<total_subject; i++){
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }
        System.out.println("=== RESULT ===");
        System.out.println("Total: " + total);
        double total_percetange_marks = total_subject * 100d;
        double percentage = total / total_percetange_marks * 100d;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75 && percentage <= 95){
            System.out.println( "Grade: " + 'A');
        } else if (percentage >= 55 && percentage <= 74){
            System.out.println("Grade: " + 'B');
        } else if (percentage >= 35 && percentage <= 54){
            System.out.println("Grade: " + 'C');
        } else {
            System.out.println('F');
        }
        int highest_value = marks[0];
        int lowest_value = marks[0];

        for (int mark : marks){
            if (mark > highest_value){
                highest_value = mark;
            } else if(mark < lowest_value){
                lowest_value = mark;
            }
        }
        System.out.println("Highest value: " + highest_value);
        System.out.println("Lowest value: " + lowest_value);
    }
}
