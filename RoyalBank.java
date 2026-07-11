import java.util.Scanner;
public class RoyalBank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Royal Bank! Please enter your name: ");
        String name = scan.nextLine();

        System.out.print("Hello " + name + "Are you here for a morgage or a personal loan, Yes/No? :");
        String loanType = scan.nextLine();

        switch (loanType.toLowerCase()) {
            case "yes":
            System.out.println("You have selected to apply for a loan.");

            System.out.print("Do you have an existing account with us? (Yes/No): ");
            String accountType = scan.nextLine();
            switch (accountType.toLowerCase()) {
                case "yes":
                    System.out.println("Please proceed to the account login page.");
                    System.out.println("How many years have you been a customer with us?");
                    int years = scan.nextInt();

                    System.out.println("Thank you for being a loyal customer for " + years + " years! \n How much do you have in your account?");
                    double balance = scan.nextDouble();
                    System.out.println("Your current balance is: $" + balance);

                    System.out.print("How much credit debt do you have? ");
                    double creditDebt = scan.nextDouble();  
                    System.out.println("Your current credit debt is: $" + creditDebt);


                    if(balance >= 10000 && creditDebt <= 5000 && years >= 2 ){
                    System.out.println("Congratulations! " + name + ", you qualify for a loan.");

                    System.out.println("Congratulations! " + name + ", please inpput the amount you want to borrow:");
                    double loanAmount = scan.nextDouble();

                    System.out.println("Congratulations! " + loanAmount + ", has been added to your account .");
                 }
                break;
            case "no":
                System.out.println("You do not have an existing account with us.");
                break;
            default:
                System.out.println("Invalid input. Please enter Yes or No.");
            }
            
            default:
                System.out.println("Hi " + name + "!, thank you for visiting Royal Bank, Goodbye!");
                break;
        
        }
       
        scan.close();
        
        
    }
   
}
