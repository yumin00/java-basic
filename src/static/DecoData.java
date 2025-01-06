public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 여기에서는 인스턴스 변수에 접근할 수 없다.
        // static 메서드에서는 static 변수에만 접근할 수 있다.
        staticValue ++;
        staticMethod();
    }

    public void instanceCall() {
        // 인스턴스 메서드에서는 인스턴스변수와 static 변수에 모두 접근할 수 있다.
        staticValue ++;
        instanceValue++;
        instanceMethod();
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instance" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("static" + staticValue);
    }
}

/*
static 메서드가 인스턴스 기능을 사용할 수 없는 이유
정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그래서 인스턴스처럼 참조값의 개념이 없다.
특정 인스턴스의 기능을 사용하려면 해당 인스턴스의 참조값이 필요한데 정적 메서드는 참조값 없이 호출하기 때문에 정적 메서드에서는 인스턴스 변수나 인스턴스 메서드를 사용할 수 없는 것이다.
 */
