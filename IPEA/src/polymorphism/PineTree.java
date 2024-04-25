package polymorphism;

public class PineTree  extends Trees {
    @Override
    void fruit() {
        System.out.println("I am pine tree, I generally don't give fruits but i am useful for making furniture!");
    }

    static void console() {
        System.out.println("This is my console log, with static method!");
    }
}
