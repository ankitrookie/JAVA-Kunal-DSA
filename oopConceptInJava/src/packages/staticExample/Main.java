package packages.staticExample;

public class Main {
    /* the main method in Java is declared as static because it needs to be
    called by the Java Virtual Machine (JVM) without creating an instance of the class. */
    public static void main(String[] args){
        Humen humensCat = new Humen(23, "Ankit", "Black", true );
        Humen humensCat2 = new Humen(67, "Radha", "Green", false );
        System.out.println(humensCat.age);
        System.out.println(humensCat2.married);
        System.out.println(Humen.population);
    }
}
