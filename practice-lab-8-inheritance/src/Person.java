public class Person {
    private int iD;
    private String name;

    Person(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    void display() {
        System.out.printf("---Person Information---\n" +
                          "ID: %d\nName: %s\n", getID(), getName());
    }

}
