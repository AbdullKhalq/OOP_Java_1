public class MainCommEmployee {
    public static void main(String[] args) {
        CommissionEmployee commEmployee = new CommissionEmployee(
        "Susan", "Armstrong", "111-111-111", 10000, 0.6);

        System.out.printf(
            "\n---Employee Information---\n" +
            "First Name: %s\n"      +
            "Last Name: %s\n"       +
            "SSN: %s\n"             +
            "Gross sales: %s\n"     +
            "Comm rate: %s\n",
            commEmployee.getFirstName(),
            commEmployee.getLastName(),
            commEmployee.getSocialSecurityNumber(),
            commEmployee.getGrossSales(),
            commEmployee.getCommissionRate()
        );

        commEmployee.setGrossSales(500);
        commEmployee.setCommissionRate(0.1);

        System.out.println("\n---Updated info obtained by toString---\n" + 
            commEmployee.toString());

        BasePlusCommissionEmployee BPlusEmployee101 = new BasePlusCommissionEmployee(
            "Bob", "Louis", "202-202-202", 
            5000, 0.4, 300);

        System.out.printf(
            "\n---BasePlusEmployee Information---\n" +
            "First Name: %s\n"      +
            "Last Name: %s\n"       +
            "SSN: %s\n"             +
            "Gross sales: %s\n"     +
            "Comm rate: %s\n"       +
            "Base Salary: %s\n",
            BPlusEmployee101.getFirstName(),
            BPlusEmployee101.getLastName(),
            BPlusEmployee101.getSocialSecurityNumber(),
            BPlusEmployee101.getGrossSales(),
            BPlusEmployee101.getCommissionRate(),
            BPlusEmployee101.getBaseSalary()
        );

        BPlusEmployee101.setBaseSalary(1000);

        System.out.println("\n---Updated info obtained by toString---\n" +
             BPlusEmployee101.toString());
    }

}
