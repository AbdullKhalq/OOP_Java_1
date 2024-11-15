public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(
            String first, String last, String ssn, 
            double sales, double rate, double salary) 
    {
        // Call the parent class constructor
        super(first, last, ssn, sales, rate);
        baseSalary = salary;
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%sbase salary: %.2f", super.toString(), baseSalary);
    }
}