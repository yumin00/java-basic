/*
멤버 변수에 `static` 을 붙이게 되면 `static` 변수, 정적 변수 또는 클래스 변수라 한다.

static이 붙은 변수는 메서드 영역에서 관리한다.

- 인스턴스 변수: static이 붙지 않으 변수
    - 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 변수라 한다.
    - 인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.
    - 힙 영역 사용
- 클래스 변수: static이 붙은 변수
    - 클래스 변수, 정적 변수, `static` 변수 등으로 부른다.
    - 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서 클래스 변수라 한다.
    - 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
    - 메서드 영역의 static 영역에 보관됨.
    - 메서드 영역은 프로그램 전체에서 사용하는 공용 공간이다. 클래스 변수는 해당 클래스가 JVM에 로딩 되는 순간 생성되고 JVM이 종료될 때까지 생명주기가 이어진다. 따라서 가장 긴 생명주기를 가진다.
    - 힙영역에 생성되는 인스턴스 변수는 동적으로 생성되고 제거된다. static 정적 변수는 프로그램 실행 시점에 만들어지고 프로그램 종료 시점에 제거된다.


 */


public class JavaData {
    String name;
    static int count;

    JavaData(String name) {
        this.name = name;
        count = 10;
    }
}
