public class Lawyer extends Employee{
    private String lawField;

    public Lawyer(int id, String name, String jobTitle,
                  int fortune, String lawField) {
        super(id, name, jobTitle, fortune);
        this.lawField = lawField;
    }

    public String getLawField() {
        return lawField;
    }

    public void setLawField(String lawField) {
        this.lawField = lawField;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Law Field: " + getLawField());
    }
}
