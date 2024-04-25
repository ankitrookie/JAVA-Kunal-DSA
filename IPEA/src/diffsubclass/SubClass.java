package diffsubclass;

import access.A;
import access.B;

public class SubClass extends B  {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args){
       SubClass a = new SubClass(788, "ankit");
       System.out.print(a.getNum());
    }
}
