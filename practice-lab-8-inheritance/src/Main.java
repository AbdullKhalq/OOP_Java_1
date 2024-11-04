public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(123, "Hamed");
        person1.display();

        Student student1 = new Student(145, "Maha");
        student1.display();

        GraduateStudent grad1 = new GraduateStudent(
                911, "Ahmed", 4.5f, "Java");
        UndergraduateStudent unGrad1 = new UndergraduateStudent(
                134, "Jamal", 3.7f, "Popcorn");
        grad1.display();
        unGrad1.display();
    }
}