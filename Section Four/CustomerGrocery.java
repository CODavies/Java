package SectionFour;

import java.util.Scanner;

public class CustomerGrocery {

    public static void main(String[] args) {
        String[] Store_Aisle = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };
        String customerRequest = getCustomerRequest();
        System.out.println(checkGroceryList(Store_Aisle, customerRequest));
    }

    public static String getCustomerRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grocery Store! Hope we have what you need.");
        System.out.println("What would you like to buy today?");
        
 while (true) {

        System.out.println("Would you like to buy something? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Great! What would you like to buy?");
            return scanner.nextLine();
        }

        if (response.equalsIgnoreCase("no")) {
            System.out.println("No worries! Have a great day!");
            System.exit(0);
        }

        System.out.println("Invalid response. Please answer with 'yes' or 'no'.");
    }
}

    public static String checkGroceryList(
            String[] storeAisle,
            String customerRequest
    ) {
        for (int i = 0; i < storeAisle.length; i++) {
            if (storeAisle[i].equalsIgnoreCase(customerRequest)) {
                return "Yes, we have " + customerRequest
                        + " in stock at aisle " + (i + 1) + ".";
            }
        }

        return "No, we do not have "
                + customerRequest + " in stock.";
    }
}
