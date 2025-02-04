import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0; // Variable to store sum of digits

        // Using do-while loop
        do {
            sum += num % 10; // Extract last digit and add to sum
            num /= 10; // Remove last digit
        } while (num > 0); // Continue until num becomes 0

        // Print the sum of digits
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
