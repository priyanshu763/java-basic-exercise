package OOPs;

public class MainSingleton {
    public static void main(String[] args) {
      /*  human kunal = new human(22,"kunal", 10000, false);
        human rahul = new human(15,"kunal", 60000, false);
        human arpit = new human(82,"kunal", 900000, true);

        System.out.println(human.population);  */

        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
        // all above 3 ref variables are pointing to just one object

    }
}