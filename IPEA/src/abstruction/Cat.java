package abstruction;

public class Cat extends Animal{
    public Cat(int age) {
        super(age);
    }
    @Override
    public void makeSound(String sound) {
        System.out.println("Cat does " + sound);
    }
}
