// 프로그래밍을 하다보면 객체를 생성하고 바로 초기값을 할당해야하는 경우가 많다.
// 앞에서 만든 initMember와 같은 메서드를 꼭 만들어주어야 한다.
// 자바에서는 필요한 기능을 좀 더 편리하게 사용할 수 있도록 "생성자"라는 기능을 제공한다.


public class MemberConstruct {
    String name;
    int age;
    int score;

    // 생성자 1
    MemberConstruct(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 생성자 2
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.score = 100;

        // 여기에서 this.name과 this.age는 생성자1과 중복임을 알 수 있다.
        // 생성자 내부에서 생성자를 다시 호출할 수도 있다.
        this(name, age, 100);
        // this()를 사용하면 생성자 내부데서 다른 생성자를 호출할 수 있다.
        // this()는 생성자 코드의 첫줄에만 작성해야한다는 규칙이 있다.
    }

    /*
    생성자의 이름은 클래스와 동일해야 한다.
    생성자는 반환 타입이 없다.
     */
}
