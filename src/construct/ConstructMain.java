public class ConstructMain {
    public static void main() {
        MemberConstruct member1 = new MemberConstruct("학생1", 14, 90);
        MemberConstruct member2 = new MemberConstruct("학생2", 19, 70);

        MemberConstruct[] members = {member1, member2};

        /*
        지금까지 객체를 생성할 때 new MemberConstruct() 로 ()괄호를 사용했는데, 그 이유가 바로 생성자를 위한 것이었다.
        객체를 생성함과 동시에 생성자를 호출한다는 의미이다.
         */

        /*
        생성자 장점
        - 객체를 생성하면서 생성 직후에 필요한 작업을 한번에 처리하여 중복 호출을 제거할 수 있다.
        - 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 한다.
        -> 개발자는 객체를 생성할 때, 직접 정의한 생성자를 필수로 호출해야 한다는 것을 바로 알 수 있다.
        즉, 생성자를 사용하면 필수값 입력을 보장할 수 있다!
         */

        /*
        만약 생성자를 설정하지 않으면, 자바에서는 "기본 생성자"를 자동으로 만들어준다.

        public class MemberDefault {
            String name;
            //기본 생성자
            public MemberDefault() {
            }
        }

        예를들어 MemberDefault를 만들고 생성자를 만들지 않으면 실제로는 MemberDefault() 라는 기본 생성자가 생성된 것이라고 할 수 있다.
         */

        /*
        생성자도 매개변수를 달리하여 오버로딩을 제공한다.
         */
        MemberConstruct member3 = new MemberConstruct("학생3", 19);

    }
}
