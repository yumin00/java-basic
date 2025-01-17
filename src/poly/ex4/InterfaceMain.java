package ex4;

public class InterfaceMain {
    public static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }
}


/*
상속 vs 구현

상속은 부모의 기능을 물려받는 것이 목적이다.
구현(인터페이스)은 메서드 이름만 있는 설계도이고, 이 설계도에 맞춰 하위 클래스에서 구현해야 한다.

상속과 구현은 표현만 다를 뿐이지 자바에서는 동일하게 작동한다.
 */

/*
순수 추상 클래스가 아니라 인터페이스를 사용해야 하는 이유
- 제약
- 다중 구현: 상속은 부모를 하나만 지정할 수 있지만, 인터페이스는 부모를 여러명 두는 다중구현이 가능하다.
 */
