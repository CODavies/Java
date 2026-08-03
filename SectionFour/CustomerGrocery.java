package SectionFour;
import java.util.Scanner;
public class CustomerGrocery {

    public static void main(String[] args) {
    String[] Store_Aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
    CustomerGrocery customer = new CustomerGrocery();
    String customerRequest = getCustomerRequest();
    System.out.println(checkGroceryList(Store_Aisle, customerRequest));
    }

    public static String getCustomerRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grocery Store! Hope we have what you need.");
        System.out.println("What would you like to buy today?");
        String request = scanner.nextLine();
        return request;
    }


    
    public static String checkGroceryList(String[] Store_Aisle, String getCustomerRequest) {
        boolean found = false;
        for (int i = 0; i < Store_Aisle.length; i++) {
            if (Store_Aisle[i].equalsIgnoreCase(getCustomerRequest)) {
                found = true;
                break;
            }
        }
        if (found) {
            return "Yes, we have " + getCustomerRequest + " in stock! at aisle " + (i + 1) + ".";
        } else {
            return "Sorry, we do not have " + getCustomerRequest + " in stock.";
        }
    }
}
