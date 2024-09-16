public class GradeBook {
    // private instance (attribute) variable
    private String courseName; 

    /* 
     * Constructor to initialize an object of the GradeBook class.
     * Since the local variable has the same name as the instance variable, 
     * 'this' is used to refer to the instance variable (courseName), 
     * differentiating it from the local parameter (name).
     */
    public GradeBook(String name) {
        this.courseName = name;
    }

    public String getCourseName () {
        return courseName;
    }
    
    public void setCourseName(String name) {
        this.courseName = name;
    }

    public void displayCourseName() {
        System.out.printf("Hello! Welcome to %s gradebook.\n", 
                            getCourseName());
    }

}
