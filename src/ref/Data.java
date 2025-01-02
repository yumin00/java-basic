public class Data {
    // value와 age는 멤버 변수
    int value;
    int age = 10; // -> 멤버변수의 초기값을 지정할 수 있다.

    public static void main() {
        Data data = null;
        System.out.println(data); // null

        data = new Data();
        System.out.println(data); // 참조값
        data = null;
        System.out.println(data); // null
        // 이때 위에서 new Data()를 통해 메모리에 할당된 Data 인스턴스는 이제 아무도 사용하지 않는다.
        // 그렇데 되면 해당 인스턴스의 참조값을 알 방법이 없다. 즉 해당 인스턴스에 다시는 접근할 수 없다.
        // 아무도 참조하지 않으면 메모리 용량만 차지!
        // 자바에서는 JVM의 GC(가비지 컬렉션)가 사용되지 않는 인스턴스를 자동으로 제거해준다.

        // System.out.println(data.value); // null의 value를 찾으라는 뜻. 이것은 NullPointerException 에러가 발생한다.

        BigData c = new BigData();
        System.out.println(c.data); // null
//        System.out.println(c.data.value); 여기에서는 에러가 발생한다.

        Data b = new Data();
        c.data = b;
        System.out.println(b.value); // 위와 같은 에러가 발생하지 않도록 변수에 참조값을 할당해주어야 한다!
    }

}

