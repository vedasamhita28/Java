import java.util.Scanner;

 class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int count = 0; // Counter for even numbers
        int i = 1; // Starting value

        // While loop to count even numbers
        while (i <= n) {
            if (i % 2 == 0) {
                count++; // Increment count if number is even
            }
            i++; // Increment loop variable
        }

        // Print the result
        System.out.println("Total even numbers from 1 to " + n + " = " + count);

        scanner.close();
    }
}
