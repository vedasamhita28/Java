import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Determine age group using if-else
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid age entered.");
        }    }
}
