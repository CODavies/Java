package Functions;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.print("Are you ready to play? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Let's play!");
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            String user_Choice = scanner.nextLine();

            String computer_Choice = computer_Choice();
            
            String final_Result = compare_results(user_Choice, computer_Choice);
            print_results(user_Choice, computer_Choice, final_Result);

        } else {
            System.out.println("Maybe next time!");
        }
        scanner.close();
    }

    public static String computer_Choice() {
        int randomNumber = (int) (Math.random() * 3);
        System.out.println("Random number: " + randomNumber);
        switch (randomNumber) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "Invalid choice";
        }
    }

    public static String compare_results(String user_Choice, String computer_Choice) {
        if (user_Choice.equalsIgnoreCase(computer_Choice)) {
            return "It is a tie!";
        } else if ((user_Choice.equalsIgnoreCase("rock") && computer_Choice.equalsIgnoreCase("scissors")) ||
                   (user_Choice.equalsIgnoreCase("paper") && computer_Choice.equalsIgnoreCase("rock")) ||
                   (user_Choice.equalsIgnoreCase("scissors") && computer_Choice.equalsIgnoreCase("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public static void print_results(String user_Choice, String computer_Choice, String compare_results) {
        System.out.println("You choose: " + user_Choice);
        System.out.println("Computer choose: " + computer_Choice);
        System.out.println(compare_results);
    }
}