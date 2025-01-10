package final1;

public class FinalRefMain {
    public static void main() {
        final Data data = new Data();
//        data = new Data()
        /*
        final을 설정하면 값을 변경할 수 없기 때문에 위는 컴파일 오류가 발생한다. 즉 참조값을 변경할 수 없다는 뜻이다.
         */
        data.value = 10;
        data.value = 30; // 이렇게 참조 대상의 값은 변경할 수 있다.
    }
}


/*
만약 특정 변수의 값을 할당한 이후에 변경하지 않아야 한다면 `final` 을 사용하면 좋다.
 */