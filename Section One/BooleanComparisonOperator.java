public class BooleanComparisonOperator {
    public static void main(String[] args) {
        int Chemistry_Grade = 85;
        int Biology_Grade = 90;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java:" + (Biology_Grade > Chemistry_Grade)+ "\n");

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make a profit?");
        System.out.println("Java: " + (sales > costs) + "\n");

        double temprature = 15.5;
        double target_Temprature = 20.0;
        System.out.println("Me: Hi Java, is the temprature below the target temprature?");

    }
}
