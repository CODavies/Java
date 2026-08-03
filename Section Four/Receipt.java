public class Receipt {


    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printReceipt();
    }
    

    public static String[] generateNames() {
        String[] names = { "Gala", "Granny Smith", "Macintosh", "Honeycrisp", "Fuji", "Pink Lady" };
        return names;
    }

    public static double[] generatePrices() {
        double[] prices = { 1.99, 0.99, 2.49, 3.99, 4.99, 2.99 };
        return prices;
    }

    public void printReceipt() {
        String[] names = generateNames();
        double[] prices = generatePrices();
        System.out.println("Receipt:");
        System.out.println("Item\t\tPrice");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s $%.2f%n", names[i], prices[i]);
        }
        System.out.printf("Total:\t\t$%.2f%n", calculateTotal(prices));
    }

    public static double calculateTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}
