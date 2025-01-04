// 프로그래밍을 하다보면 객체를 생성하고 바로 초기값을 할당해야하는 경우가 많다.
// 앞에서 만든 initMember와 같은 메서드를 꼭 만들어주어야 한다.
// 자바에서는 필요한 기능을 좀 더 편리하게 사용할 수 있도록 "생성자"라는 기능을 제공한다.


public class MemberConstruct {
    String name;
    int age;
    int score;

    // 생성자
    MemberConstruct(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /*
    생성자의 이름은 클래스와 동일해야 한다.
    생성자는 반환 타입이 없다.
     */
}
