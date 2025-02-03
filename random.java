import java.util.Random;

public class RandomSum {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate two random numbers
        int num1 = random.nextInt(100); // Generates a number between 0 and 99
        int num2 = random.nextInt(100);

        // Calculate sum
        int sum = num1 + num2;

        // Display numbers and sum
        System.out.println("Random Number 1: " + num1);
        System.out.println("Random Number 2: " + num2);
        System.out.println("Sum: " + sum);
    }
}
