public class UndergraduateStudent extends Student{
    private String projectTitle;

    public UndergraduateStudent(int id, String name, int cohort,
                                String projectTitle) {
        super(id, name, cohort);
        this.projectTitle = projectTitle;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Project Title: " + getProjectTitle());
    }
}
