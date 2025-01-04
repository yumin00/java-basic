public class MethodInitMain {
    public static void main() {
        MemberInit member1 = new MemberInit();
        member1.name = "학생1";
        member1.age = 16;
        member1.score = 80;

        MemberInit member2 = new MemberInit();
        member2.name = "학생2";
        member2.age = 19;
        member2.score = 90;

        MemberInit[] members = {member1, member2};

        // member의 초기값을 설정하는 부분이 게속 반복된다.

        // 이를 개선하기 위해 메서드를 사용하여 반복을 제거해보자.
        MemberInit member3 = new MemberInit();
        member3.initMember("학생3", 18, 30);;

        MemberInit member4 = new MemberInit();
        member4.initMember("학생4", 15, 90);
    }
}
