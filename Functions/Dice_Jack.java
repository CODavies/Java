package Functions;

import java.util.Scanner;

public class Dice_Jack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roll1 = roll_Dice();
        int roll2 = roll_Dice();
        int roll3 = roll_Dice();


        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();




        System.out.println("Roll 1: " + roll1);
        System.out.println("Roll 2: " + roll2);
        System.out.println("Roll 3: " + roll3);
    }


    public static boolean areLessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    public static int roll_Dice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}
