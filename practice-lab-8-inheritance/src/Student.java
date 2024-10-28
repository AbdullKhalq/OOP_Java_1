public class Student extends Person {
    private float GPA;

    Student(int iD, String name) {
        super(iD, name);
    }

    Student(int iD, String name, float GPA) {
        super(iD, name);
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    void display() {
        super.display();
        System.out.printf("GPA: %s\n", getGPA());
    }
}
