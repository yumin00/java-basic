package car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("setCar car");
        this.car = car;
    }

    public void drive() {
        System.out.println("drive car");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }


}
