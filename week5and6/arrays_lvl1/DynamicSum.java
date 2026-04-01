import java.util.Scanner;

public class DynamicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (Enter 0 or negative to stop):");

        // Infinite loop with break conditions
        while (true) {
            if (index == 10) {
                break;
            }

            double entry = scanner.nextDouble();

            if (entry <= 0) {
                break;
            }

            values[index] = entry;
            index++;
        }

        // Calculate total using a separate loop
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
            total += values[i];
        }

        System.out.println("\nTotal value: " + total);
    }
}