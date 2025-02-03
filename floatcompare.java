import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two float numbers
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        // Convert to integers by multiplying by 1000
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);

        // Compare values
        if (intNum1 == intNum2) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are NOT equal up to three decimal places.");
        }
    }
}
