/*
자바에서는 public, private와 같은 접근 제어자(access modifier)를 제공한다.
접근제어자를 사용하면 해당 클래스를 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다.

아래 예시를 통해 접근제어자의 필요성에 대해 알아보자
 */

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp(int volume) {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가했습니다.");
        }
    }
}
