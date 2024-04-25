package inheritance;

public class ChildClassesForWeight extends  Box {
    double weight;

    public ChildClassesForWeight(double side, double weight) {
        super(side);
        /**** The "super" keyword in programming is like a special code that lets you access and use stuff
         * from a parent class when you're working in a subclass. It's like asking your parent for help or borrowing
         * something they have. So, when you use "super" in your code, you're basically saying, "Hey, give me access
         * to what's in my parent classes I can use it here. ****/
        this.weight = weight;
        System.out.println(super.weight);
    }
}


