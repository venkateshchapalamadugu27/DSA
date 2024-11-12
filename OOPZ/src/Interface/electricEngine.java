package Interface;

public class electricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("ElectricEngine Engine started");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine Engine stopped");

    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine Engine acelerate");

    }
}
