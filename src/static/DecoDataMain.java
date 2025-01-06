public class DecoDataMain {
    public static void main() {
        DecoData.staticCall();

        DecoData data = new DecoData();
        data.instanceCall();
    }

}

/*
메인 메서드는 정적 메서드이다.

메인 메서드는 인스턴스 생성 없이 실행이 가능하다.
 */