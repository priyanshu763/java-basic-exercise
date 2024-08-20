package OOPs.AbstractDemo;

public class Main {
    public static void main(String[] args ) {
        Son son  = new Son(30);
        son.career();

        son.normal();

        Parent.hello();

        Daughter daughter = new Daughter(24);
        daughter.career();

        // note: you cannot create objects of abstract classes
        //Parent mom = new Parent();

        //note : similarly you cannot create abstract constructors
        // note : you too cannot create abstract static methods

    }
}
