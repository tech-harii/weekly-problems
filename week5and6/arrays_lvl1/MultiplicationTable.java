import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();
        
        int[] table = new int[10];

        // Calculate and store results
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display results
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}