package PersonPackage;

public class Advisor extends Person {
    private String dept;

    Advisor(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    void display() {
        super.display();
        System.out.printf("Dept: %s", getDept());

    }
}
