import java.util.Scanner;

public class WashingMachineTimeEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight of clothes and water level
        System.out.print("Enter the weight of clothes (grams): ");
        int weight = scanner.nextInt();
        System.out.print("Enter water level (L, M, or H): ");
        char waterLevel = scanner.next().charAt(0);

        // Initialize time needed
        int time = 0;

        // Validate weight and perform fuzzy time estimation
        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("Time Estimated: 0 minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else {
            // Fuzzy logic based on weight and water level
            switch (waterLevel) {
                case 'L':
                    if (weight <= 2000) {
                        time = 25;
                    }
                    break;
                case 'M':
                    if (weight > 2000 && weight <= 4000) {
                        time = 35;
                    }
                    break;
                case 'H':
                    if (weight > 4000) {
                        time = 45;
                    }
                    break;
                default:
                    System.out.println("INVALID WATER LEVEL");
                    return; // Exit program if invalid water level
            }

            if (time > 0) {
                System.out.println("Time Estimated: " + time + " minutes");
            }
        }
    }
}
