
public class ForLoopExa {

    public static void main(String[] args) {
        
        printNumbers();
        printStrings();
        printMultiplicationTable();
        printReverseNumbers();
        printEvenNumbers();
        }
        
    public static void printNumbers() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    
    public static void printStrings() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, world!");
        }
    }
    
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }  
    }


    public static void printReverseNumbers() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }   
    }

    public static void printEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
   
    }
}
