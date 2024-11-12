package Interface;

public class Car implements Engine,Brake{

    @Override
    public void brake() {
        System.out.println("I brake as Toyota Supra");
    }

    @Override
    public void start() {
        System.out.println("I start as Toyota Supra");
    }

    @Override
    public void stop() {
        System.out.println("I stop as Toyota Supra");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate as Toyota Supra");
    }
}
