```java
package src;

public class Class2 {
    public static void main() {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 17;
        student1.score = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.score = 50;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
    }
}
```

위 코드에서 메모리가 어떻게 할당되는지에 대해 알아보자.

<img width="1073" alt="image" src="https://github.com/user-attachments/assets/82da779c-1b5f-49b6-a17c-ea745873ce85" />


주의해야하는 것은, 자바에서 값을 대입할 때는 변수에 들어있는 값을 복사해서 전달한다.

즉, `students[0] = student1`에서 student1에 들어있는 값은 x001이고 이 값이 students[0]에 복사된다!