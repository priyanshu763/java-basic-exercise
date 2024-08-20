package OOPs;

public class MainInheritence {
    public static void main(String[] args) {
     /*   Box box1 = new Box(6.7, 7.0, 3.0);
        Box box2 = new Box(box1);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,8);

        System.out.println(box4.h + " " + box4.weight);

        Box box5 = new BoxWeight(2,4,7,9);
        System.out.println(box5.h);  */

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence , you should have access to weight varaible
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why its giving error
        // BoxWeight box6 = new Box(2,3.4);
        // System.out.println(box6);


        BoxWeight box1 = new BoxWeight();
        Box box2 = new BoxWeight();
        Box box3 = new Box();
        box1.greeting();  // you can inherit but you cannot override
        box2.greeting();
        box3.greeting();
        // static does ont depend on objects


    }
}
