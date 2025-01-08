package final1;

/*
final 키워드는 말 그대로 끝! 이라는 뜻이다.
변수에 final이라는 키워드가 붙으면 더이상 변수의 값을 변경할 수 없다는 의미이다.
 */

public class FinalLocalMain {
    public static void main() {
        final int data1;
        data1 = 10; // 변수를 한 번만 할당할 수 있다.

//        data1 = 30; // 컴파일 오류 발생
        method(data1);
    }

    /*
    매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다.
    메서드 호출 시점에 사용된 값이 끝까지 사용된다!
     */
    static void method(final int parameter) {
//        parameter = 20; 컴파일 오류 발생
        System.out.println(parameter);
    }
}
