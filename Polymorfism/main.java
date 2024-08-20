package Polymorfism;

public class main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        // Square square = new Square();
        Shapes square = new Square();  //the method calling is depend on type of object i.e., Square()

        square.area();
    }
}
// types of polymorfism
// 1.compile time polymorfism : method overloading =[same name but types, argument,return types,ordering can be different]
// example : multiple constructors with different number of arguments

// 2.runtime or dynamic polymorfism : method overriding =[when parent class and child class has everything same but just a body is different]
// example  : above


// ENCAPSULATION : wrapping up the implementation of the data members and methods in a class(process of containing the information)
// ABSTRACTION : hiding unnecessary details and showing valuable information (process of gaining the information)