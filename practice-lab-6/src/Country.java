public class Country {
    private String name, capital;
    private int population;
    private float area;

    Country(){
    }

    Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    Country(String name, String capital, float area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
    
    Country(String name, String capital, int population,
            float area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    void displayName() {
        System.out.printf("Name: %s\n", getName());
    }

    void displayCapital() {
        System.out.printf("Capital: %s\n", getCapital());
    }

    void displayPopulation() {
        System.out.printf("Population: %s\n", getPopulation());
    }

    void displayArea() {
        System.out.printf("Area: %s\n", getArea());
    }

    void displayAllInformation() {
        displayName();
        displayCapital();
        displayPopulation();
        displayArea();
    }
}
