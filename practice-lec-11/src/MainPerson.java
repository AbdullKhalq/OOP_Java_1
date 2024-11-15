public class MainPerson {
    public static void main(String[] args) {
        Person folan = new Person(1, "folan");

        Student alaan = new Student(10, "Alaan", 1900,
                "Law");

        UndergraduateStudent folana = new UndergraduateStudent(
                20, "folana", 2020,
                "Fun in STEM");

        GraduateStudent theGS = new GraduateStudent(
                100, "Hafiz", 1995,
                "CS", "πSmart for better Future!");

        Employee hsson = new Employee(900, "hsson", "Analysis",
                                      6700);

        Lawyer lawyer1 = new Lawyer(2, "James McGill", "copywriter",
                                    1000000, "Illicit Trades");

        folan.displayInfo();
        alaan.displayInfo();
        folana.displayInfo();
        theGS.displayInfo();
        hsson.displayInfo();
        lawyer1.displayInfo();
    }
}