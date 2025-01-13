package basic;

public class CastingMain3 {
    public static void main() {
        Child child = new Child();

        // 업캐스팅은 아래와 같은 방법으로 진행할 수 있다.

        Parent parent1 = (Parent) child; // 업캐스팅
        Parent parent2 = child; // 업캐스팅 생략

        // 업캐스팅은 자주 사용되기 때문에 생략하는 방법을 권장한다.

        Parent parent3 = new Parent();
        Parent parent4 = new Child();

        if (parent3 instanceof Child) {
            System.out.println("3 is CHILD");
        } else {
            System.out.println("3 is NOT CHILD");
        }

        if (parent4 instanceof Child) {
            System.out.println("4 IS CHILD");
        }
    }
}
