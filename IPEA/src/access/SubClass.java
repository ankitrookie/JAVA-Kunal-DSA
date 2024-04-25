package access;

public class SubClass  extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A a = new A(45, "ankit");
        System.out.print(a.getNum());
    }
}
