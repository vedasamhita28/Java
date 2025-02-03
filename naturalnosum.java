import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        int sum = 0; // Initialize sum

        System.out.print("Natural numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i; // Add each number to sum
        }

        System.out.println("\nSum of first " + n + " natural numbers: " + sum);
    }
}
