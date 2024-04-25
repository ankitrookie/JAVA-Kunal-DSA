package interfaces;

public class Car implements Brake, Engine {
    @Override
    public void brake() {
        System.out.println("I brake as a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start as a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerator as a normal car");
    }
}
