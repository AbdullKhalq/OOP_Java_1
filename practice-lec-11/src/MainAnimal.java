public class MainAnimal {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal3 = myCat;

        /*
        Animal ourAnimal = new Animal();
        Cat ourCat = ourAnimal;
         */

        /* following gives syntax error
        Animal ourAnimal = new Animal();
        Cat ourCat = ourAnimal;
         */

        myCat.eat();
        myAnimal3.eat();
        System.out.println("ourAnimal: " + myAnimal3.getClass());
        System.out.println("myCat: " + myCat.getClass());
    }
}
