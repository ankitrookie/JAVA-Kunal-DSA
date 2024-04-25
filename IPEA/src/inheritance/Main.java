package inheritance;

public class Main {
    public static void main(String[] args){
//        Box box1 = new Box(34.5, 56,34);
//        System.out.print("Height : " + box1.height + " Length : " + box1.length + " Width : " + box1.width);

        ChildClassesForWeight box2 = new ChildClassesForWeight(34, 67);
        System.out.println("Height : " + box2.height + " Length : " + box2.length + " Width : " + box2.width);
        System.out.print("This is weight : " + box2.weight);
    }
}

// 1.
 /***** Inheritance is a fundamental concept in object-oriented programming (OOP).
 It allows a class (subclass or child class) to inherit properties and behaviors
 from another class (superclass or parent class). ******/

 // so if i want to access parent class thing we use super in that case;

// 2.
// Types of inheritance
