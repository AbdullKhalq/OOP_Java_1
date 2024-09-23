/*
    public class Ship1 {              (In Ship1.java)
    public double x, y, speed, direction;
    public String name;
  }
  
  public class Test1 {              (In Test1.java)
    public static void main(String[] args) {
      Ship1 s1 = new Ship1();
      s1.x = 0.0;
      s1.y = 0.0;
      s1.speed = 1.0;
      s1.direction = 0.0;   // East
      s1.name = "Ship1";
      Ship1 s2 = new Ship1();
      s2.x = 0.0;
      s2.y = 0.0;
      s2.speed = 2.0;
      s2.direction = 135.0; // Northwest
      s2.name = "Ship2";
      s1.x = s1.x + s1.speed
             * Math.cos(s1.direction * Math.PI / 180.0);
      s1.y = s1.y + s1.speed
             * Math.sin(s1.direction * Math.PI / 180.0);
      s2.x = s2.x + s2.speed
             * Math.cos(s2.direction * Math.PI / 180.0);
      s2.y = s2.y + s2.speed
             * Math.sin(s2.direction * Math.PI / 180.0);
      System.out.println(s1.name + " is at ("
                         + s1.x + "," + s1.y + ").");
      System.out.println(s2.name + " is at ("
                         + s2.x + "," + s2.y + ").");
    }
  }
  
*/

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
