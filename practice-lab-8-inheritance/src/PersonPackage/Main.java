package PersonPackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(123, "Hamed");

        Student student1 = new Student(145, "Maha");

        GraduateStudent grad1 = new GraduateStudent(
                911, "Ahmed", 4.5f, "Java");
        UndergraduateStudent unGrad1 = new UndergraduateStudent(
                134, "Jamal", 3.7f, "Popcorn");

        System.out.println("\nTrying list");
        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.displayStudentList();

        System.out.println("\nTry Search");
        Scanner reader = new Scanner(System.in);
        int iD;
        String name;
        System.out.print("Enter iD: ");
        iD = reader.nextInt();

        Student toSearch = studentList.search(iD);
        if (toSearch == null)
            System.out.println("Not Found");
        else
            toSearch.display();

        System.out.println("Enter name: ");
        name = reader.next();
        Student toSearch2 = studentList.search(name);
        if (toSearch2 == null)
            System.out.println("Not Found");
        else
            toSearch2.display();
    }
}