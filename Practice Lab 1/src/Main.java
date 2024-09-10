import java.util.Scanner; // to use Scanner class and methods

public class Main {
    public static void main(String[] args) {
        String name;
        short age;
        
        // var 'reader' of type 'Scanner' class. 
        // can be used to read input using correct method
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        
        // 'reader' an object of 'Scanner' class, which has method 'nextLine'
        name = reader.nextLine();

        System.out.print("Enter your age: ");
        age = reader.nextShort();

        // print with format. '%' placeholder 's' string 'd' decimal int,
        // followed by var's respectively
        System.out.printf("Hello, \t%s of %d. Welcome to Java!", name, age);

        System.out.println(1);
        System.out.println(2);

        System.out.println("New training...");
        
        System.out.println("Printing from 0 to 5 using for loop");

        for (int i = 0; i < 6; i++) {
            System.out.printf("Number now is: %d\n", i);
        }



    }
}