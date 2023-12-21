package exercise2;

abstract class GameTester {
    protected String name;
    protected boolean status;

    public GameTester(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public abstract double finalSalary();

    public String toString() {
        return "Name: " + name + ", Status: " + status;
    }
}

	

class FullTimeGameTester extends GameTester {
    private static final double FULL_TIME_SALARY = 3000;

    public FullTimeGameTester(String name) {
        super(name, true);
    }

    @Override
    public double finalSalary() {
        return FULL_TIME_SALARY;
    }
}



class PartTimeGameTester extends GameTester {
    private static final double HOURLY_RATE = 20;
    private double workedHours;

    public PartTimeGameTester(String name, double workedHours) {
        super(name, false);
        this.workedHours = workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double finalSalary() {
        return HOURLY_RATE * workedHours;
    }
}


