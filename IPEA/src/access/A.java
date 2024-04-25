package access;

public class A {
    protected int num;
    private String name;
    private int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int[] getArr() {
        return arr;
    }
}
