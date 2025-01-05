public class SpeakerMain {
    public static void main() {
        Speaker speaker = new Speaker(90);

//        speaker.volume = 200;
        /*
        위와 같이 Speaker 내 멤버변수인 volume에 직접 접근할 수 있다.
        volume은 100을 초과하면 안되지만 멤버변수에 직접 접근할 수 있게 한다면 이 규칙을 모르는 개발자는 volume을 마음대로 수정하여 오류가 발생할 수 있다.

        따라서 volume 필드에 접근할 수 없도록 해야 한다.
        --> Speaker 클래스의 volume 필드를 private로 설정하면 된다.

         */
    }
}

/*
접근제어자

- private: 모든 외부 호출을 막는다
- default: 같은 패키지 안에서의 호출은 허용
- protected: 같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
- public: 모든 외부 호출을 허용

허용 순서
public > protected > default > private

접근 제어자를 명시하지 않으면 default로 자동 설정된다.

- 클래스는 public, default만 사용할 수 있다.
- `public` 클래스는 반드시 파일명과 이름이 같아야 한다.
- 하나의 자바 파일에 public 클래스는 하나만 등장할 수 있다.
- 하나의 자바 파일에 default 접근제어자를 사용하는 클래스는 무한정으로 만들 수 있다.

 */