import java.util.Scanner;

public class BlackJack {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack Java Casino!");
        System.out.println("Dealing your cards...");
        System.out.println("Do you have a knack for BlackJack? Let's find out!");
        System.out.println("Ready? Press Enter to begin!");

        scanner.nextLine();

        int card1 = draw_random_card();
        int card2 = draw_random_card();

        System.out.println(
                "You get a\n" +
                        card_string(card1) +
                        "\nand a\n" +
                        card_string(card2));

        int total = Math.min(card1, 10) + Math.min(card2, 10);
        System.out.println("Your total is: " + total);

        int dealer_card1 = draw_random_card();
        int dealer_card2 = draw_random_card();

        System.out.println(
                "The dealer shows\n" +
                        card_string(dealer_card1) +
                        "\nand has a card facing down\n" +
                        face_down());

        int dealer_total = Math.min(dealer_card1, 10) +
                Math.min(dealer_card2, 10);

        System.out.println("The dealer's total is hidden!");

        String user_input = hitOrStay();
        System.out.println("You chose: " + user_input);
    }

    public static int draw_random_card() {
        return (int) (Math.random() * 13) + 1;
    }

    public static String card_string(int card_number) {
    switch (card_number) {
        case 1:
            return " ________\n" +
                    "|A       |\n" +
                    "|   _    |\n" +
                    "|  ( )   |\n" +
                    "| (_'_)  |\n" +
                    "|_______A|\n";

        case 2:
            return " ________\n" +
                    "|2       |\n" +
                    "|    o   |\n" +
                    "|        |\n" +
                    "| o      |\n" +
                    "|_______2|\n";

        case 3:
            return " ________\n" +
                    "|3       |\n" +
                    "| o      |\n" +
                    "|    o   |\n" +
                    "|      o |\n" +
                    "|_______3|\n";

        case 4:
            return " ________\n" +
                    "|4       |\n" +
                    "| o    o |\n" +
                    "|        |\n" +
                    "| o    o |\n" +
                    "|_______4|\n";

        case 5:
            return " ________\n" +
                    "|5       |\n" +
                    "| o    o |\n" +
                    "|   o    |\n" +
                    "| o    o |\n" +
                    "|_______5|\n";

        case 6:
            return " ________\n" +
                    "|6       |\n" +
                    "| o    o |\n" +
                    "| o    o |\n" +
                    "| o    o |\n" +
                    "|_______6|\n";

        case 7:
            return " ________\n" +
                    "|7       |\n" +
                    "| o    o |\n" +
                    "| o  o o |\n" +
                    "| o    o |\n" +
                    "|_______7|\n";

        case 8:
            return " ________\n" +
                    "|8       |\n" +
                    "| o    o |\n" +
                    "| o    o |\n" +
                    "| o    o |\n" +
                    "|_______8|\n";

        case 9:
            return " ________\n" +
                    "|9       |\n" +
                    "| o o  o |\n" +
                    "|   o    |\n" +
                    "| o o  o |\n" +
                    "|_______9|\n";

        case 10:
            return " ________\n" +
                    "|10      |\n" +
                    "| o o  o |\n" +
                    "| o o  o |\n" +
                    "| o o  o |\n" +
                    "|______10|\n";

        case 11:
            return " ________\n" +
                    "|J       |\n" +
                    "| o    o |\n" +
                    "|   o    |\n" +
                    "| o    o |\n" +
                    "|_______J|\n";

        case 12:
            return " ________\n" +
                    "|Q       |\n" +
                    "| o    o |\n" +
                    "| o o  o |\n" +
                    "| o    o |\n" +
                    "|_______Q|\n";

        case 13:
            return " ________\n" +
                    "|K       |\n" +
                    "| o    o |\n" +
                    "| o o  o |\n" +
                    "| o    o |\n" +
                    "|_______K|\n";
    
        default:
            return "Unknown";
    }
}

    public static String hitOrStay() {
        System.out.println("Hit or stay?");

        String user_input = scanner.nextLine();

        while (!user_input.equalsIgnoreCase("hit")
                && !user_input.equalsIgnoreCase("stay")) {
            System.out.println("Please write 'hit' or 'stay':");
            user_input = scanner.nextLine();
        }

        return user_input;
    }

    public static String face_down() {
        return " ________\n" +
                "|        |\n" +
                "|    J   |\n" +
                "|   JJJ  |\n" +
                "|    J   |\n" +
                "|________|\n";
    }
}