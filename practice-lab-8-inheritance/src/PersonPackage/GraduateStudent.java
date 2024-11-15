package PersonPackage;

public class GraduateStudent extends Student {
    private String thesisTitle;

    GraduateStudent(int iD, String name, float GPA) {
        super(iD, name, GPA);
    }

    GraduateStudent(int iD, String name, float GPA, String thesisTitle) {
        super(iD, name, GPA);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    void display() {
        super.display();
        System.out.printf("Thesis Title: %s\n", getThesisTitle());
    }
}
