package final1;

import java.util.concurrent.Callable;

public class FinalFieldMain {
    public static void main() {
        ConstructInit int1 = new ConstructInit(10);
        ConstructInit int2 = new ConstructInit(20);

        FieldInit int3 = new FieldInit();

        System.out.println(int1.value);
        System.out.println(int2.value);
        System.out.println(int3.value);
        System.out.println(FieldInit.CONST_VALUE);

        /*
        final + 필드 초기화를 하는 경우 static을 붙이는 것이 효과적이다!
         */
    }
}
