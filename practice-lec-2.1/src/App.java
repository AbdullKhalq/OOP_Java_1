public class App {
    public static void main(String[] args) {
        
        /*
         * Initialize an object from GradeBook class by calling
         * the constructor method and taking the parameters given
         * in the definition of the constructor method
         * in the GradeBook class
         */
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