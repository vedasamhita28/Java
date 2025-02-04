import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1; // Initialize result
        int i = 0; // Counter variable

        // Using do-while loop to calculate power
        do {
            result *= base;
            i++;
        } while (i < exponent); // Loop runs until i reaches exponent

        // Print the result
        System.out.println(base + "^" + exponent + " = " + result);

        scanner.close();
    }
}
