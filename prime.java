import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Handle numbers less than 2
        if (num < 2) {
            System.out.println(num + " is NOT a prime number.");
        } else {
            boolean isPrime = true;

            // Check divisibility from 2 to num-1
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(num + " is a PRIME number.");
            } else {
                System.out.println(num + " is NOT a prime number.");
            }
        }

        scanner.close();
    }
}
