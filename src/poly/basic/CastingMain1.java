package basic;

public class CastingMain1 {
    public static void main() {
        Parent poly = new Child();
        // 다운캐스팅: 부모타입을 잠깐 자식 타입으로 변경하는 것
        Child child = (Child) poly;
        child.childMethod();
    }
}

/*
자식 타입 기능을 사용하기 위해서 위와 같이 다운캐스팅을 진행해야 한다.
다운캐스팅 결과를 변수에 담아두고 사용하는 것은 번거롭기 때문에 일시적 다운 캐스팅을 통해 하위 클래스의 기능을 바로 호출할 수 있다.
 */
