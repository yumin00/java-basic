package diamon;

public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodCommon() {
        System.out.println("COMMON");
    }

}
