package abstruction;

public class Camel extends Animal {

    public Camel(int age) {
        super(age);
    }

    @Override
    public void makeSound(String sound) {
        System.out.println("Camel does " + sound);
    }
}
