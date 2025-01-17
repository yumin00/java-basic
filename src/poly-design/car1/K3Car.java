package car1;

public class K3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("K3Car starting engine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car off engine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car press accelerator");
    }
}
