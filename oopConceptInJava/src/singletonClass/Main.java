package singletonClass;

public class Main {
    public static void main(String[] arg){
        Singleton obj1 = new Singleton.getInstance();
        Singleton obj2 = new Singleton.getInstance();
        Singleton obj3 = new Singleton.getInstance();
    }
}
