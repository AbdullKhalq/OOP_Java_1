public class Nurse extends Employee {
    private String position;

    public Nurse() {
        super();
        this.position = null;
    }

    public Nurse(int iD, String name, String email, 
                 String phoneNumber, char gender, double salary, 
                 String position) {
        super(iD, name, email, phoneNumber, gender, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void displayPosition() {
        System.out.printf("Position: %s\n", getPosition());
    }
    
    public void displayAllInformation() {
        super.displayAllInformation();
        displayPosition();
    }

}