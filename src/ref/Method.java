public class Method {

    public static void main() {
        int a = 10;
        System.out.println(a); // 10
        changePrimitive(a);
        System.out.println(a); // 10 : 값복사이기 때문에 changePrimitive로 인해 a는 변하지 않음

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println(dataA.value);
        changePrimitive(dataA.value); // 값 복사이기 때문에 dataA.value는 변하지 않음.
        System.out.println(dataA.value);
        changePrimitiveClass(dataA); // 참조값 복사이기 때문에 dataA.value가 변함.
        System.out.println(dataA.value);

        // a와 dataA는 지역변수

    }

    static void changePrimitive(int x) {
        x = 2;
    }

    static void changePrimitiveClass(Data a) {
        a.value = 2;
    }
}
