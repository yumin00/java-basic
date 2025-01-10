package final1;

public class ConstructInit {
    final int value;

    public ConstructInit(int value) {
        /*
        final을 필드에 사용할 경우 생성자를 통해서 한번만 초기화할 수 있다.
         */
        this.value = value;
    }
}
