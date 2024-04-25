package packages.staticExample;

public class Humen {
    int age;
    String name;
    String color;
    boolean married;
    static int population;
    //  when you declare something as static in Java, it means it belongs to the class itself rather than to instances of the class
    public Humen(int age, String name, String color, boolean married){
        this.age = age;
        this.name = name;
        this.color = color;
        this.married = married;
        Humen.population = 1;
    }

}
