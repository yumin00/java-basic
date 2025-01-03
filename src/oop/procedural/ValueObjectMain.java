package procedural;

public class ValueObjectMain {
    public static void main() {
        ValueObject data = new ValueObject();
        data.add(); // 1
        data.add(); // 2

        System.out.println(data.value); // 2
    }
}

// 클래스는 속성과 기능을 정의할 수 있다.
// 속성: 멤버 변수
// 기능: 메서드
// 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.

// 위에서 정의한 data는 add(메서드)를 통해서 자신의 변수(value) 에 접근할 수 있는 것이다.
// 객체의 메서드 내부에서 접근하는 멤버 변수는 "객체 자신의 멤버 변수"이다.