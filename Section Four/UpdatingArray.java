import java.util.Arrays;
public class UpdatingArray {
    public static void main(String[] args) {
        String[] menu = { "Pizza", "Burger", "Pasta", "Salad", "Sushi" }; 
        menu [2] = "Tacos";
        System.out.println(Arrays.toString(menu));
    }
}
