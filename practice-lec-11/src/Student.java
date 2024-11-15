public class Student extends Person{
    private int cohort;
    private float gpa;
    private String department;

    public Student(int id, String name, int cohort) {
        super(id, name);
        this.cohort = cohort;
    }

    public Student(int id, String name, int cohort, String department) {
        super(id, name);
        this.cohort = cohort;
        this.department = department;
    }

    public int getCohort() {
        return cohort;
    }

    public void setCohort(int cohort) {
        this.cohort = cohort;
    }

    public float getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
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
        System.out.println("Cohort: "       + getCohort()   + '\n' +
                           "GPA: "          + getGPA()      + '\n' + 
                           "Department: "   + getDepartment());
    }
}
