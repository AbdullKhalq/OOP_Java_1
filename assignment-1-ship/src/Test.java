public class Test {
    public static void main(String[] args) {

       Ship ship2 = new Ship("Titanic");

       ship2.setSpeed(2);
       ship2.setDirection(202.49);

       System.out.println("\n----Trying ship----\n");

       ship2.displayAllInformation();

       System.out.println("\n----Trying speedboat----\n");
       
       SpeedBoat speed1 = new SpeedBoat("Hello", 31.4f, 50.0f, 23, 180,35, 200, 12);

       speed1.displayAllInformation();
    }
}
