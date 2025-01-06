public class JavaDataMain {
    public static void main() {
        JavaData data = new JavaData("데이터");
        System.out.println(JavaData.count); // 클래스를 통한 접근
        System.out.println(data.count); // 인스턴스를 통한 접근
        JavaData.count = 30;
        System.out.println(JavaData.count);

        /*
        정적 변수의 경우 인스턴스를 통한 접근은 추천하지 않는다.
        왜냐하면 코드를 읽을 때 마치 인스턴스 변수에 접근하는것 처럼 오해할 수 있기 때문이다.
         */
    }
}
