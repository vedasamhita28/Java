import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking inputs manually
        System.out.print("Enter Principal Amount (P): ");
        int P = scanner.nextInt();
        
        System.out.print("Enter Rate of Interest (R): ");
        int R = scanner.nextInt();
        
        System.out.print("Enter Time in years (T): ");
        int T = scanner.nextInt();
        
        // Calculate Simple Interest using formula (P × T × R) / 100
        int simpleInterest = (P * T * R) / 100;
        
        // Display result
        System.out.println("Simple Interest = " + simpleInterest);
        
        scanner.close();
    }
}
