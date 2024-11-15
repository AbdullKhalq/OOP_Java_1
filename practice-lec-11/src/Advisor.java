public class Advisor extends Person{
    private String department;

    public Advisor(int id, String name) {
        super(id, name);
    }

    public Advisor(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + getDepartment());
    }

}
