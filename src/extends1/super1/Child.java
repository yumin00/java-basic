package super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("child.hello");
    }

    public void call() {
        System.out.println(this.value);
        System.out.println(super.value);

        this.hello();
        super.hello();
    }
}

/*
super라는 키워드를 통해 오버라이딩이 되어 있더라도 부모를 참조할 수 있다.

super는 본인 타입의 상위를 의하만다.
 */