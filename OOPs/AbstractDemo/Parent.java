package OOPs.AbstractDemo;

public abstract class Parent {
    int age;
    public Parent(int age) {
        this.age = age;

    }

    // can create static methods
    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");

    }
    abstract void career();
    abstract void partner();
}