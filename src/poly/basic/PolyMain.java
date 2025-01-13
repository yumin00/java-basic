package basic;

public class PolyMain {
    public static void main() {
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        /*
        다형적 참조
        부모는 자식을 품을 수 있다.
         */

        Parent poly = new Child();
        poly.parentMethod();

        /*
        Child 인스턴스를 생성하면 Parent도 생성된다.
        하지만 poly는 Parent타입이기 때문에 상속 관계에서 Child로 내려갈 수는 없다!
        하지만 만약 poly에서 childMethod를 호출하고 싶다면 어떻게 해야할까?
        그러기 위해서는 캐스팅이 필요하다.
         */
    }
}
