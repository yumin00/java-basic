package pack;

import pack.a.User;
public class PackageMain {
    public static void main() {
        Data data = new Data();
        // PackageMain과 user는 서로 다른 패키지이기 때문에 패키지의 전체 경로를 포함하여 아래와 같이 작성해야한다.
//        pack.a.User user = new pack.a.User();

        // 항상 전체 경로를 적는 것은 불편하기 때문에 import를 사용할 수도 있다.
        User user = new User();
    }
}

/*
패키지 규칙
- 패키지의 이름과 위치는 폴더 위치와 같아야 한다.
 */