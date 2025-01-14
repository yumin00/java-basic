package ex3;

public abstract class Animal {
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

/*
abstract 추상화가 붙은 추상 클래스는 직접 인스턴스를 생성할 수 없다.
abstract 추상화가 붙은 추상 메서드는 자식이 반드시 오버라이딩을 해야 한다.
 */

/*
만약 move도 추상메서드였다면,
Animal은 순수 추상 클래스이다.

순수 추상 클래스란?
모든 메서드가 추상 메서드인 추상 클래스.
- 인스턴스를 생성할 수 없다.
- 상속시 자식은 모든 메서드를 오버라이딩해야 한다.
- 주로 다형성을 위해 사용된다.

순수 추상 클래스는 어떤 규격을 지켜서 구현해야하는 것처럼 느껴지는데,
자바에서는 순수 추상 클래스를 더 편리하게 사용할 수 있도록 인터페이스라는 개념을 제공한다.
 */