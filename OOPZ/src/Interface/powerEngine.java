package Interface;

public class powerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stopped");

    }

    @Override
    public void acc() {
        System.out.println("Power Engine acelerate");

    }
}
