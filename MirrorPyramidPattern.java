import java.util.Scanner;

public class MirrorPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the pattern
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        // Upper part of the diamond
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = size; i >= 1; i--) {
            // Print spaces
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
