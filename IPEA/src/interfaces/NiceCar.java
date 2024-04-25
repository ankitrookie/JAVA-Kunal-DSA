package interfaces;

public class NiceCar {
    private Engine engine;
    private Media media = new MP4Player();
    public NiceCar() {
       engine = new ElectricEngine();
    }
    public void getEngine() {
        engine.start();
    }

    public void getStart() {
        engine.start();
    }
    public void getStop() {
        engine.stop();
    }

    public void getAcc() {
        engine.acc();
    }

    public void getStartMusic() {
        media.start();
    }

    public void getStopMusic() {
        media.stop();
    }

    public void upgradeEngine() {
        this.engine = new HydroEngine();
    }
}
