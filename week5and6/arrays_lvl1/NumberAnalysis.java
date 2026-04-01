import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Logic loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last (" + last + ").");
        }
    }
}