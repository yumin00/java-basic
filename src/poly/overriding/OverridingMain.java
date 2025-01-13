package overriding;

public class OverridingMain {
    public static void main() {
        Child child = new Child();
        child.method();

        Parent parent = new Parent();
        parent.method();

        Parent poly = new Child();
        System.out.println(poly.value);
        // 오버라이딩된 메서드는 항상 우선권을 갖는다.
        poly.method();
    }
}
