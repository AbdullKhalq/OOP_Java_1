package PersonPackage;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void displayStudentList() {
        for(Student i: studentList) {
            i.display();
        }
    }

    public Student search(int iD) {
        Student targetStudent = null;
        for (Student i: studentList) {
            if(i.getID() == iD) {
                targetStudent = i;
                break;
            }
        }
        return targetStudent;
    }

    public Student search(String name) {
        Student targetStudent = null;
        for (Student i: studentList) {
            if(i.getName().equals(name)) {
                targetStudent = i;
                break;
            }
        }
        return targetStudent;
    }


}
