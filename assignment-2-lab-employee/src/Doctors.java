public class Doctors extends Employee {
    private String ranking, specialty;

    public Doctors() {
        this.ranking = null;
        this.specialty = null;
    }

    public Doctors(int iD, String name, String email, 
                   String phoneNumber, char gender, 
                   double salary, String ranking,
                   String specialty) {
        super(iD, name, email, phoneNumber, gender, salary);
        this.ranking = ranking;
        this.specialty = specialty;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void displayRanking() {
        System.out.printf("Ranking: %s\n", getRanking());
    }

    public void displaySpecialty() {
        System.out.printf("Specialty: %s\n", getSpecialty());
    }

    public void displayAllInformation() {
        super.displayAllInformation();
        displayRanking();
        displaySpecialty();
    }
}
