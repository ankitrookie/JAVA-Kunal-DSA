package abstruction;

public class Dog extends Animal {
    public Dog(int age) {
        super(age);
    }

    @Override
    public void makeSound(String sound) {
        System.out.println("Dog does " + sound);
    }
}
