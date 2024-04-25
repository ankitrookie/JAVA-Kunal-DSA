package interfaces;

public class Main {
    public static void main(String[] args) {
        Car A = new Car();
        Engine d = new Car();
        Brake c = new Car();
        MP4Player media = new MP4Player();


        NiceCar nc = new NiceCar();
        nc.getStart();
        nc.getStartMusic();
        // from i am changing my engine
        nc.upgradeEngine();
        nc.getStart();
    }
//        media.start();
//        media.stop();
//        c.brake();
//        c.start();
//        c.acc();
//        c.stop();
//        c.brake();
}
