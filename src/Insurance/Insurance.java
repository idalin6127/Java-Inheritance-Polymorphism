package exercise1;

import java.util.Scanner;

abstract class Insurance {
    private String typeOfInsurance;
    private double monthlyCost;

    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }

    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }
    
    public void setMonthlyCost(double cost) {
        monthlyCost = cost;
    }

    public abstract void setInsuranceCost();

    public abstract void displayInfo();
}

class Health extends Insurance {
    public Health() {
        super("Health Insurance");
    }

    //Override
    public void setInsuranceCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plese enter the monthly cost for Health Insurance: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); // Consume new line

        setMonthlyCost(cost);
    }

    //Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}

class Life extends Insurance {
    public Life() {
        super("Life Insurance");
    }

    //Override
    public void setInsuranceCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the monthly cost for Life Insurance: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); // Consume new line

        setMonthlyCost(cost);
    }

    //Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getTypeOfInsurance());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }

}
 
 
 
 




