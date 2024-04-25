package access;

public class Main {
    public static void main(String[] args){
        A obj = new A(10, "Ankit");
        // need to do few things
        // 1. access the data members
        // 2. modify the data members

        System.out.println(obj.getNum());
    }
}



/***
    Getter and Setter in Java

    Getter:

    Purpose: Get information.
    Example: getAge() method in a Person class returns the age.
    Analogous to: Pressing a button to read a value from a toy.
    Setter:

    Purpose: Set or update information.
    Example: setAge(int newAge) method in a Person class sets a new age.
    Analogous to: Pressing a button to change a value in a toy, with rules to ensure it's valid.
    Rules for Setter:

    Age cannot be negative.
    Age cannot be too high (e.g., limited to 120 years). ***/