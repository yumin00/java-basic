package ex5;

public class Bird extends Animal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("훨 훨");
    }
}

/*
하나의 클래스 안에는 하나의 부모를 상속받고 여러 개의 인터페이스를 구현할 수 있다.
 */