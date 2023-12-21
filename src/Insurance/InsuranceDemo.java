package exercise1;

import java.util.Scanner;

public class InsuranceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of insurances: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Insurance[] insurances = new Insurance[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the type of insurance (Health/Life): ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("Health")) {
                insurances[i] = new Health();
            } else if (type.equalsIgnoreCase("Life")) {
                insurances[i] = new Life();
            } else {
                System.out.println("Invalid insurance type. ");
                continue;
            }

            insurances[i].setInsuranceCost();
        }

        System.out.println("\nInsurance Information:");
        for (Insurance insurance : insurances) {
            if (insurance != null) {
                System.out.println();
                insurance.displayInfo();
            }
        }
    }
    
}