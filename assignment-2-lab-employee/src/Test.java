public class Test {
    public static void main(String[] args) {
        Employee employee_1 = new Employee();

        Employee employee_2 = new Employee(122, "Hamad", 
                                        "Hamad@gmail.com", "0543", 
                                        'M', 4000.23);

        Doctors doctors_1 = new Doctors(230, "Moyad", 
                                        "Moyad@gmail.com", "0314", 
                                        'M', 8043.23, "Intern", "Bones");

        Nurse nurse_1 = new Nurse(771, "Maha", 
                                  "Maha@gmail.com", "0100", 
                                  'F', 30500.05, "Chief");

        Admin admin_1 = new Admin(001, "Zuckerberg", 
                                  "Zuckerberg@facebook.com", "2004", 
                                  'M', 1000000.99, "Head of Meta");
        
        employee_2.displayAllInformation();
        doctors_1.displayAllInformation();
        nurse_1.displayAllInformation();
        admin_1.displayAllInformation();
    }
}
