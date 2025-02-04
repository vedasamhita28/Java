import java.util.Scanner;

public class weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weekday number
        System.out.print("Enter a number (1-7): ");
        int num = scanner.nextInt();

        // Validate input
        if (num < 1 || num > 7) {
            System.out.println("Invalid input! Enter a number between 1 and 7.");
        } else {
            // Using if-else to determine the day
            if (num == 1) {
                System.out.println("Sunday");
            } else if (num == 2) {
                System.out.println("Monday");
            } else if (num == 3) {
                System.out.println("Tuesday");
            } else if (num == 4) {
                System.out.println("Wednesday");
            } else if (num == 5) {
                System.out.println("Thursday");
            } else if (num == 6) {
                System.out.println("Friday");
            } else {
                System.out.println("Saturday");
            }
        }
    }
}
