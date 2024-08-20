package OOPs;


public class Introduction {
    public static void main(String[] args) {

        // data of 5 students : { roll no., name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student kunal = new Student();
        //kunal.changeName("sweety");
        kunal.greeting();

        Student rahul = new Student(78, "rahul", 90.8f);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student rossow = new Student();




        //  kunal.rno = 13;
        //  kunal.name = "kunal Khushwaha";
        //  kunal.marks = 88.5f;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);



    }
}
// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;  // default values of marks when nothing is passed in marks

    // we need a way to add the values of the above properties object by object
    // we need one woed to access every object

    void greeting() {
        System.out.println("hello! my name is " + name);
        System.out.println("hello! my name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a contructor  frok another constructor
        // internally : new Student (13, "Default person", 100.0f);
        this (13,"deafult person", 100.0f);
    }

    /*Student() {
        this.rno = 13;
        this.name = "Kunal Kushwaha";
        this.marks = 88.5f;
    }  */


    // Student arpiut = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
