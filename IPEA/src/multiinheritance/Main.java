package multiinheritance;

public class Main {
    public static void main(String[] args){
        PantPocket pantComponents = new PantPocket("ankit", 45, 2, 4);
        System.out.print("My name is " + pantComponents.name + " and I am age of " + pantComponents.age + " and my pant have " + pantComponents.numberOfPantZip + " numbers of zip. And also i have " + pantComponents.numberOfPockets);
    }
}
