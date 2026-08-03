import java.util.Arrays;
public class Tax {
    public static void main(String[] args) {
        double [] prices = price();
        System.out.println("The original prices are: " + Arrays.toString(prices));
        double [] afterTax = newPrice(prices);
       System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }

    public static double [] price(){
        double [] prices = { 1.99, 0.99, 2.49, 3.99, 4.99, 2.99 };
        return prices;
    }


    public static double [] newPrice(double [] prices){
        double [] afterTax = new double[prices.length];
        for (int i = 0; i < prices.length; i++) {
            afterTax[i] = prices[i] + (prices[i] * 0.13);
        }
        return afterTax;



    }
}
