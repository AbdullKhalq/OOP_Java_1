public class Overload {
    public void demo(int a) {
        System.out.println("a: " + a);
    }

    public void demo(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    public double demo(double a) {
        System.out.println("Double a: " + a);
        return a*a;
    }
}
