package singletonClass;

public class Singleton {
    /***** A Singleton class is a class that can only have one instance throughout the entire application.
     It's useful when you want to ensure there's only one instance of a class and provide a global point
     of access to that instance. *****/
    public Singleton(){

    }
    public static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
