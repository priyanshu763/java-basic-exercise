package OOPs;

//Inheriting
public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

//    static void greeting() {
//        System.out.println("hey I am in Boxweight class greetings");
//        return;
//    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }
}
