package access;

public class B extends A {
    public B(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A a = new A(45, "ankit");
    }
}
