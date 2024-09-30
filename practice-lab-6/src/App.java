public class App {
    public static void main(String[] args) {
        Country coun1 = new Country();
        Country coun2 = new Country("Saudi Arabia", "Riyadh", 200000f);
        Country coun3 = new Country("Jordan", "Amman");
        Country coun4 = new Country("China", "Bejing", 10000000, 6000000000f);

        coun1.displayAllInformation();
        coun2.displayAllInformation();
        coun3.displayAllInformation();
        coun4.displayAllInformation();
    }
}
