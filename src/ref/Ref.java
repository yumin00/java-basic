public class Ref {
    public static void main() {
        Data a = new Data();
        a.value = 10;
        Data b = a; // 여기에서 참조값을 복사하기 때문에 a.value의 값이 수정되면 같은 참조값을 가지는 b.value도 수정된다.
        System.out.println(b.value); // 10

        a.value = 30;
        System.out.println(b.value); // 30
    }
}
