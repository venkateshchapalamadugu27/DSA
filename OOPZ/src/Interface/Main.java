package Interface;

public class Main {
    public static void main(String[] args) {
//        Car supra=new Car();
//        supra.acc();
//        supra.start();
//       System.out.println(supra.cc);

        NiceCar car=new NiceCar();
        car.start();
        car.mediaStart();
        car.stop();
        car.upgrade();
        car.start();
        car.stop();

    }
}
