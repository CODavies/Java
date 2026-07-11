package Functions;

public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.2);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        
    
}
public static double calculateArea(double length, double width) {
    if (length <= 0 || width <=0) {
        System.out.println("Invalid dimensions.");
        System.exit(0);
    }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "The area of the rectangle is length * width";
            case "French":
                return "L'aire du rectangle est la longueur * la largeur";
            case "Spanish":
                return " area es igual a  largo *  ancho ";
            default:
                return "Invalid language.";
        }
    }
}
