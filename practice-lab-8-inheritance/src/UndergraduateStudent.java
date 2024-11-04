public class UndergraduateStudent extends Student {
    private String projectTitle;

    UndergraduateStudent(int iD, String name, float GPA) {
        super(iD, name, GPA);
    }

    UndergraduateStudent(int iD, String name, float GPA, String projectTitle) {
        super(iD, name, GPA);
        this.projectTitle = projectTitle;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    @Override
    void display() {
        super.display();
        System.out.printf("Project Title: %s\n", getProjectTitle());
    }
}
