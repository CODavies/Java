import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
       System.out.println("Welcome to the survey!");

       System.out.println("\nPlease answer the following questions:");

       Scanner scanner = new Scanner(System.in);
       int counter = 0;

       System.out.println("\nWhat is your name?");
       String name = scanner.nextLine();
       counter++;

       System.out.println("\nHow much money do you spend on coffee?");
       double coffeePrice = scanner.nextDouble();
       counter++;

       System.out.println("\nHow much money do you spend on fast food?");
       double fastFoodPrice = scanner.nextDouble();
       counter++;

       System.out.println("\nHow many times a week do you buy coffee?");
       int coffeeFrequency = scanner.nextInt();
       counter++;

       System.out.println("\nHow many times a week do you buy fast food?");
       int fastFoodFrequency = scanner.nextInt();
       counter++;

       scanner.close();

       System.out.println("Thank you " + name + " for participating in the survey!, and answering " + counter + " questions.");
       System.out.println("Weekly " + name + " spends" + " $" + (coffeePrice * coffeeFrequency) + "on coffee");
       System.out.println("Weekly " + name + " spends" + " $" + (fastFoodPrice * fastFoodFrequency) + "on fast food");
    }
}
