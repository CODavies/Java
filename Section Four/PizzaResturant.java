import java.util.Scanner;

public class PizzaResturant {

    public static void main(String[] args) {

        String[] toppings = generateToppings();
        displayToppings(toppings);

    }

    public static String[] generateToppings() {

        System.out.println("Please enter the number of toppings you would like on your pizza : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String[] toppings = new String[input];

        for (int i = 0; i < input; i++) {
            System.out.println("Please enter the name of topping " + (i + 1) + ": ");
            toppings[i] = scanner.next();
        }
        System.out.println("\nThank you for your order. Your pizza will be ready shortly!");

        return toppings;
    }

    public static void displayToppings(String[] toppings) {

        System.out.println("\nYou ordered " + toppings.length + " toppings.");

        for (int i = 0; i < toppings.length; i++) {
            System.out.println("Topping " + (i + 1) + ": " + toppings[i]);
        }
    }
}
