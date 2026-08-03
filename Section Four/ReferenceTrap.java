import java.util.Arrays;
public class ReferenceTrap {

    public static void main(String[] args) {
        String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "East Anglia"};
        String[] kingdoms2 = Arrays.copyOf(kingdoms, kingdoms.length);

        System.out.println("The first kingdom is: " + Arrays.toString(kingdoms));
        System.out.println("The first kingdom in kingdoms2 is: " + Arrays.toString(kingdoms2));

        kingdoms2[1] = "Kent";

        System.out.println("The first kingdom is: " + Arrays.toString(kingdoms));
        System.out.println("The first kingdom in kingdoms2 is: " + Arrays.toString(kingdoms2));
    }
    
}
