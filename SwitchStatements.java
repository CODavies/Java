public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "rainy";
            switch (weather) {
                case "sunny":
                    System.out.println("It's a bright and sunny day!, you should wear a shirt");
                    break;
                case "rainy":
                    System.out.println("Don't forget your umbrella!, you should wear a raincoat");
                    break;
                case "snowy":
                    System.out.println("Time for some snow fun!, you should wear a jacket");
                    break;
                default:
                    System.out.println("Weather condition unknown.");
            }

        int role = 2;
        switch (role) {
            case 1:
                System.out.println("You are an Admin.");
                break;
            case 2:
                System.out.println("You are a Moderator.");
                break;
            case 3:
                System.out.println("You are a User.");
                break;
            default:
                System.out.println("Role not recognized.");
        }
        int temperature = 75;
        int humidity = 65;
        if (temperature > 80 && humidity > 60) {
            System.out.println("It's hot and humid outside.");
        } else if (temperature > 80) {
            System.out.println("It's hot outside.");
        } else if (humidity > 60) {
            System.out.println("It's humid outside.");
        } else {
            System.out.println("The weather is comfortable.");
        }
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";
        switch (lightColor) {
            case "green":
                System.out.println("You can go.");
                break;
            case "yellow":
                System.out.println("Get ready to stop.");
                break;
            case "red":
                System.out.println("You must stop.");
                break;
            default:
                System.out.println("Invalid traffic light color.");
        }
        // Section 2: Exam grade
        int grade = 85;
       switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("You are using Google Chrome.");
                break;
            case "Firefox":
                System.out.println("You are using Mozilla Firefox.");
                break;
            case "Safari":
                System.out.println("You are using Apple Safari.");
                break;
            default:
                System.out.println("Unknown browser.");
        }
        

    }
}
