import java.util.Scanner;
public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am a chatbot. What is your name?");
        String name = scanner.nextLine();

        System.out.println("\nNice to meet you, " + name + "! where are you from?");
        String location = scanner.nextLine();

        System.out.println("\n" + location + " is a beautiful place! How old are you?");
        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();

        System.out.println("\nSo you are " + age + " years old! I am 400 years old.");
        System.out.println ("\nThis means is that I am " + (400 /age) + " years older than you.");
        System.out.println("\nEnough about me. What is your favorite language?, don't say python, I don't like it.");
        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println("\nNice chatting with you, " + name + "! I hope you have a great day!");
        scanner.close();
    }
}
