// import java.util.Scanner;


// public by default
class GradeBook {
    // private instance variable
    private String courseName; 

    // constructor method to intialize objects from this class
    public GradeBook(String name) {
        this.courseName = name;
    }

    public String getCourseName () {
        return courseName;
    }
    
    public void setCourseName(String name) {
        // local var with same name of instance var, 
        // thus use 'this' to refer to instance variable (attribute),
        // rather than any other local variables
        this.courseName = name;
    }

    public void displayCourseName() {
        // calls 'getCourseName' to get name
        System.out.printf("Hello! Welcome to %s gradebook.\n", getCourseName());
    }

}

// word 'public' in classes needs it's own files
public class App {
    public static void main(String[] args) {
        // Scanner reader = new Scanner(System.in); // for future add-on's
        
        GradeBook book1 = new GradeBook("CS50");
        GradeBook book2 = new GradeBook("CS not 50");

        book1.displayCourseName();
        book2.displayCourseName();

        book1.setCourseName("CS51");
        book2.setCourseName("CS21");

        System.out.printf("welcome to : %s \n", book1.getCourseName());
        System.out.printf("welcome to : %s \n", book2.getCourseName());

    }
}
