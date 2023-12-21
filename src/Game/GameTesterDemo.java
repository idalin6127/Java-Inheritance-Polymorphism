package exercise2;

import java.util.Scanner;

public class GameTesterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name of the game tester: ");
        String name = scanner.nextLine();

        System.out.print("Please choose game tester type (full-time/part-time): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("full-time")) {
            FullTimeGameTester gameTester = new FullTimeGameTester(name);
            double salary = gameTester.finalSalary();
            System.out.println("The full-time salary is: $" + salary);
        } else if (type.equalsIgnoreCase("part-time")) {
            System.out.print("Please enter the number of hours: ");
            double workedHours = scanner.nextDouble();
            scanner.nextLine();

            PartTimeGameTester gameTester = new PartTimeGameTester(name, workedHours);
            double salary = gameTester.finalSalary();
            System.out.println("Salary: $" + salary);
        } else {
            System.out.println("Invalid input.");
        }
    }
}

