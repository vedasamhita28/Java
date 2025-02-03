import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Handles the case where the number is 0
        if (num == 0) {
            System.out.println("Number of digits: 1");
        } else {
            int count = 0;

            // Convert negative number to positive manually
            if (num < 0) {
                num = -num;
            }

            // Count digits using while loop
            while (num > 0) {
                num = num / 10;
                count++;
            }

            System.out.println("Number of digits: " + count);
        }

        scanner.close();
    }
}
