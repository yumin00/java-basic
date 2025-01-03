package procedural;

// 절자 지향 프로그래밍1
public class MusicPlayer1 {
    public static void main() {
        int volumn = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        volumn ++;
        System.out.println("음악 플레이어 볼륨:" + volumn);

        volumn ++;
        System.out.println("음악 플레이어 볼륨:" + volumn);

        volumn --;
        System.out.println("음악 플레이어 볼륨:" + volumn);

        System.out.println("음악 플레이어 상태 확인");

        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}

// 절자 지향 프로그래밍이란?
// 실행 순서가 중요한 프로그래밍 / 프로그램의 흐름을 순차적으로 따르며 처리한다. "어떻게" 중심으로 프로그래밍을 한다.


// 객체 지향 프로그래밍이란?
// 객체: 실제 세계의 사물이나 사건을 모두 객체로 보고 객체들 간의 상호작용을 중심으로 프로그래밍 하는 방식
// "무엇을" 중심으로 프로그래밍을 한다.