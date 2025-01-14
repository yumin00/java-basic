package ex4;

/*
인터페이스를 상속 받을 때는 implements(구현)이라는 키워드를 사용한다.
인터페이스는 상속이 아니라 구현이라고 표현한다.
 */

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움진인다.");
    }
}
