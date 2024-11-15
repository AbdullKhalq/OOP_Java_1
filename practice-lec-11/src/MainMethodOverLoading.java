public class MainMethodOverLoading {
    public static void main(String[] args) {
        Overload overload1 = new Overload();
        double result;

        overload1.demo(10);
        overload1.demo(10, 20);
        result = overload1.demo(5.5);
        System.out.println("Overload output: " + result);
    }
}
