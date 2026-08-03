public class RandomNumber {
    public static void main(String[] args) {
        int [] randomNumbers = generateRandomNumber();
        System.out.println("\nThe highest number is: " + findHighestNumber(randomNumbers));
    }

    public static int[] generateRandomNumber() {
         int [] randomNumbers = new int[13];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 1000) + 1; // Generate random numbers between 1 and 1000
        }
        System.out.println("Random 13 numbers between 1 and 1000: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        return randomNumbers;
    }

    public static int findHighestNumber(int [] randomNumbers) {
        int highestNumber = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > highestNumber) {
                highestNumber = randomNumbers[i];
            }
        }
        return highestNumber;
    }
}
