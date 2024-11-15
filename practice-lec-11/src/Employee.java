public class Employee extends Person {
    private String jobTitle;
    private int fortune;
    private int vacationDays;

    public Employee(int id, String name, String jobTitle) {
        super(id, name);
        this.jobTitle = jobTitle;
    }

    public Employee(int id, String name, String jobTitle, int fortune) {
        super(id, name);
        this.jobTitle = jobTitle;
        this.fortune = fortune;
    }

    public Employee(int id, String name, String jobTitle,
                    int fortune, int vacationDays) {
        super(id, name);
        this.jobTitle = jobTitle;
        this.fortune = fortune;
        this.vacationDays = vacationDays;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.printf("Job title: %s\nFortune: %d\nVacation Days: %d\n",
                getJobTitle(), getFortune(), getVacationDays());
    }
}
