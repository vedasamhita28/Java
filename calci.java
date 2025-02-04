import java.util.Scanner;

public class calci
    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Input operation choice
        System.out.print("Enter operation (a for addition, s for subtraction, m for multiplication, d for division, u for modulus): ");
        char operation = scanner.next().charAt(0);

        int result = 0;
        boolean validOperation = true;

        // Perform operation based on user input
        if (operation == 'a') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operation == 's') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operation == 'm') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operation == 'd') {
            if (num2 != 0) {
                double divisionResult = (double) num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + divisionResult);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else if (operation == 'u') {
            if (num2 != 0) {
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
            } else {
                System.out.println("Error: Modulus by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Invalid operation choice.");
            validOperation = false;
        }

        scanner.close();
    }
}
