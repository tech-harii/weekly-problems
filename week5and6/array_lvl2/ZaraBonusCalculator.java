import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];
        
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input Loop with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (sal < 0 || years < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--; // Decrement index to retry this employee
            } else {
                salaries[i] = sal;
                yearsOfService[i] = years;
            }
        }

        // Calculation Loop
        for (int i = 0; i < 10; i++) {
            double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercent;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\n--- Payout Summary ---");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
