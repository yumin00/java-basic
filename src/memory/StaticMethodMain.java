public class StaticMethodMain {
    public static void main(String[] args) {
        String s1 = "hello java";
        StaticMethod1 static1 = new StaticMethod1();
        String deco1 = static1.deco(s1);
        System.out.println("before: " + s1);
        System.out.println("after: " + deco1);

        /*
        앞서 개발한 `deco()` 메서드를 호출하기 위해서는 `static1` 의 인스턴스를 먼저 생성해야 한다.
        그런데 `deco()`라는 기능은 멤버 변수도 없고, 단순히 기능만 제공할 뿐이다.
        인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수)등을 사용하는 목적이 큰데, 이 메서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.
         */

        String s2 = "hello java";
        String deco2 = StaticMethod2.deco(s2);
        System.out.println("before: " + s2);
        System.out.println("after: " + deco2);

        /*
        메서드 앞에 `static` 이 붙어있다. 이렇게 하면 정적 메서드를 만들 수 있다.
        그리고 아래와 같이 정적 메서드는 정적 변수처럼 "인스턴스 생성 없이" 클래스 명을 통해서 바로 호출할 수 있다.
         */

        String  s3 = "hello java";
        String deco3 = StaticMethod2.deco(s3);
        System.out.println("before: " + s3);
        System.out.println("after: " + deco3);

        /*
        정적 메서드 덕분에 불필요한 객체 생성 없이 편리하게 메서드를 사용할 수 있다.

        [클래스 메서드]
        - static이 붙은 메서드
        - 정적 메서드 혹은 클래스 메서드라고 한다.

        [인스턴스 메서드]
        - static이 붙지 않은 메서드
        - 인스턴스를 생성해야 호출할 수 있다.
         */
    }
}
