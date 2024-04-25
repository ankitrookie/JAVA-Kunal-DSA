package multiinheritance;

public class PantPocket extends PantZip {
    int numberOfPockets;

    public PantPocket(String name, int age, int numberOfPantZip, int numberOfPockets) {
        super(name, age, numberOfPantZip);
        this.numberOfPockets = numberOfPockets;
    }
}
