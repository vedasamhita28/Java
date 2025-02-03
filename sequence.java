import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Loop to print numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}



//Intialization outside 


import java.util.Scanner;

public class NumberSequenceNoInit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number n
        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();

        int i = 1; // Initialization outside the loop

        System.out.print("The first " + n + " natural numbers are: ");

        for (; i <= n; i++) { // No initialization inside for loop
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
