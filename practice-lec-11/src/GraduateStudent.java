public class GraduateStudent extends Student{
    private String thesisTitle;

    public GraduateStudent(int id, String name, int cohort) {
        super(id, name, cohort);
    }

    public GraduateStudent(int id, String name, int cohort,
                           String department, String thesisTitle) {
        super(id, name, cohort, department);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Title: " + getThesisTitle());
    }
}
