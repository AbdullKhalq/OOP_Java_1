public class Admin extends Employee {
    private String jobTitle;

    public Admin() {
        this.jobTitle = null;
    }    

    public Admin(int iD, String name, String email, 
                 String phoneNumber, char gender, 
                 double salary, String jobTitle) {
        super(iD, name, email, phoneNumber, gender, salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void displayJobTitle() {
        System.out.printf("Job Title: %s\n", getJobTitle());
    }

    public void displayAllInformation() {
        super.displayAllInformation();
        displayJobTitle();
    }

}
