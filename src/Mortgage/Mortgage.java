package exercise3;

import java.util.Scanner;


public abstract class Mortgage implements MortgageConstants {
    protected int mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int term;

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        setMortgageAmount(mortgageAmount);
        setTerm(term);
    }

    public void setMortgageAmount(double mortgageAmount) {
        if (mortgageAmount <= maxMortgageAmount)
            this.mortgageAmount = mortgageAmount;
        else
            this.mortgageAmount = maxMortgageAmount;
    }

    public void setTerm(int term) {
        if (term == shortTerm || term == mediumTerm || term == longTerm)
            this.term = term;
        else
            this.term = shortTerm;
    }

    public String getMortgageInfo() {
        return "Mortgage Number is: " + mortgageNumber +
                "; \nCustomer Name is: " + customerName +
                ";\nAmount of Mortgage is: $" + mortgageAmount +
                ";\nInterest Rate is: " + interestRate +
                "\nTerm is: " + term + " years";
    }

    public abstract void setInterestRate(double rate);
}

interface MortgageConstants {
    int shortTerm = 1;
    int mediumTerm = 3;
    int longTerm = 5;
    String bankName = "CityToronto bank";
    double maxMortgageAmount = 300000;
}

  class BusinessMortgage extends Mortgage {
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        //setInterestRate(1 + getPrimeRate());
    }

    //Override
    public void setInterestRate(double rate) {
        interestRate = rate + 0.01;
    }
}

 class PersonalMortgage extends Mortgage {
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, int term) {
        super(mortgageNumber, customerName, mortgageAmount, term);
        //setInterestRate(2 + getPrimeRate());
    }

    //Override
    public void setInterestRate(double rate) {
        interestRate = rate + 0.02;
    }

}
