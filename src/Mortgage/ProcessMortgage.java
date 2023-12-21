package exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mortgage[] mortgages = new Mortgage[3];

        // Prompt the user for the current interest rate
        System.out.print("Please enter current interest rate: ");
        double currentInterestRate = scanner.nextDouble();

        // Show each mortgage
        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("\nMortgage " + (i + 1) + ":");

            // Prompt the user for the mortgage type
            System.out.print("Please enter mortgage type (B for Business, P for Personal): ");
            String mortgageType = scanner.next();

            // Prompt the user for the mortgage details
            System.out.print("Please enter mortgage number: ");
            int mortgageNumber = scanner.nextInt();
            
            System.out.print("Please enter customer name: ");
            String customerName = scanner.next();
            
            System.out.print("Please enter mortgage amount: ");
            double mortgageAmount = scanner.nextDouble();
            
            System.out.print("Please enter mortgage term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int mortgageTerm = scanner.nextInt();

            // Create the corresponding mortgage object based on the user input
            if (mortgageType.equalsIgnoreCase("B")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, mortgageTerm);
            
            } else if (mortgageType.equalsIgnoreCase("P")) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, mortgageTerm);
            
            } else {
                System.out.println("Invalid mortgage type. Default as Personal Mortgage.");
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, mortgageTerm);
            }

            // Set the interest rate based on the current interest rate entered by the user
            mortgages[i].setInterestRate(currentInterestRate);
        }

        scanner.close();

        // Show all mortgages
        System.out.println("\nAll Mortgages is:");
        for (Mortgage mortgage : mortgages) {
            System.out.println("\n" + mortgage.getMortgageInfo());
        }
    }
}


