package OOPs.AbstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println(" I'm going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love iron man");
    }
}
