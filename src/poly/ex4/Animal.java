package ex4;

public interface Animal {
    void sound();
    void move();
}

/*
순수 추상 클래스
- 인스턴스를 생성할 수 없다.
- 상속시 모든 메서드를 오버라이딩해야한다.
- 주로 다형성을 위해 사용된다.

인터페이스는 위와 같은 순수 추상 클래스의 특징에 약간의 편의 기능이 추가된다.
- 인터페이스의 메서드는 모두 public, abstract이다.
- 메서드에 public abstract를 생략할 수 있으며, 생략하는 것이 권장된다.
- 다중 구현(다중 상속)을 지원한다.
 */
