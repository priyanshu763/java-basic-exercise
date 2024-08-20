package OOPs;

// INHERITENCE
public class Box {
    double l;
    double h;
    double w;


    static void greeting() {
        System.out.println("hey, I'm in Box class. Greetings!");
        return;
    }


    public Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }



    // cube

    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;

    }

    public void information() {
        System.out.println("running the box");
    }
}
