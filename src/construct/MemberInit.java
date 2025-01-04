public class MemberInit {
    String name;
    int age;
    int score;

    void initMember(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    // 매개변수와 멤버변수의 이름이 동일한데 둘을 어떻게 구분할 수 있는 것일까?
    // 멤버 변수보다 매개변수가 initMember 코드 블럭의 더 안에 있기 때문에 매개변수가 더 우선순위가 높다.
    // 따라서 name이라고 적으면 매개변수 name을 의미하는 것이다.
    // 멤버 변수에 접근하기 위해서는 this. 를 사용해야 한다.
    // this: 인스턴스 자신의 참조값을 가리킨다.

    // 만약 매개변수와 멤버변수의 이름이 다르면 this.를 사용하지 않고 멤버 변수에 접근할 수 있다.

    void initMember2(String memberName, int memberAge, int memberScore) {
        name = memberName;
        age = memberAge;
        score = memberScore;
    }

    // 위와 같이 this를 사용하지 않을 수도 있다.
    // 하지만 일부러 this를 사용하는 코딩 스타일도 있다.
    // 멤버변수를 사용한다는 것을 눈으로 쉽게 확인할 수 있도록 강제로 this를 사용할 수도 있다.

    // 하지만 요즘 IDE에서는 멤버변수일 경우 색이 다르기 때문에 굳이 this를 강조할 필요는 없을 것 같다.
}
