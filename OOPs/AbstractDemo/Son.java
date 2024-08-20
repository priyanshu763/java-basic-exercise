package OOPs.AbstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println(" I'm going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love pepper potts");
    }
}
