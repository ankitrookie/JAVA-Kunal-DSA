package multiinheritance;

public class PantZip extends Pant {
    int numberOfPantZip;

    public PantZip(String name, int age, int numberOfPantZip) {
        super(name, age);
        this.numberOfPantZip = numberOfPantZip;
    }
}
