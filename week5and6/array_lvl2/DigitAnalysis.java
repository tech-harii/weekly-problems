import java.util.Scanner;

public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            if (index == maxDigit) break;
            
            digits[index] = (int)(Math.abs(number) % 10);
            number /= 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit: N/A (All digits are same or only one digit exists)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}