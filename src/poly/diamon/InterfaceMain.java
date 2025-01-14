package diamon;

public class InterfaceMain {
    public static void main() {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

//        Child child = new InterfaceA(); 인터페이스는 인스턴스를 생성할 수 없다!!!!

    }
}
