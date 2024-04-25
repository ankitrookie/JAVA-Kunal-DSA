package interfaces;

public class HydroEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start new hydro engine!");
    }

    @Override
    public void stop() {
        System.out.println("Stop new hydro engine!");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate new hydro engine!");
    }
}
