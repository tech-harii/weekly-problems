package week5and6.array_lvl3;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take input for the number
        System.out.print("Enter a number: ");
        long originalNumber = sc.nextLong();
        long temp = Math.abs(originalNumber);
        long numForDigits = temp;

        // 2. Find the count of digits (to size the array)
        int digitCount = 0;
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                digitCount++;
            }
        }

        // 3. Extract digits and save them in an array
        int[] digitsArray = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = (int) (numForDigits % 10);
            numForDigits /= 10;
        }

        // 4. Find frequency using a frequency array of size 10
        // Index 0 represents digit 0, Index 1 represents digit 1, etc.
        int[] freqArray = new int[10];

        for (int i = 0; i < digitsArray.length; i++) {
            int digitValue = digitsArray[i]; 
            freqArray[digitValue]++; // Increment the count at that specific digit's index
        }

        // 5. Display the frequency of each digit
        System.out.println("\nDigit Frequency Table:");
        System.out.println("Digit | Frequency");
        System.out.println("---------------");
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] > 0) {
                System.out.println("  " + i + "   |    " + freqArray[i]);
            }
        }
    }
}