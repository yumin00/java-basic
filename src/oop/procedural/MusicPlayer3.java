package procedural;

// 절차 지향 프로그래밍3
public class MusicPlayer3 {
    public static void main() {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }


    public static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    public static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    public static void volumeUp(MusicPlayerData data) {
        data.volume ++;
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

// 각 기능을 메서드로 만들어서 각각의 기능이 모듈화됨
// 모듈화란? 레고 블록처럼 끼워서 만들 수 있는 것. 메서드를 블록 단위로 만들었기 떄문에 음악 플레이어 필요한 메서드를 조립하여 원하는 프로그래밍을 할 수 있다.

// 절차 지향 프로그래밍의 한계
// 데이터와 기능이 분리되어 있다!
// MusicPlayerData라는 데이터와 이의 기능인 on, off .. 와 같은 기능이 서로 분리되어 있다.
// 데이터와 기능이 서로 밀접한 관계에 있지만 분리되어 있다면 유지보수할 것이 두 배로 늘어난다.

// 데이터와 기능을 온전히 하나로 묶어 사용하는 것이 객체 지향 프로그래밍이다.