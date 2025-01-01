package src;

import javax.swing.plaf.synth.SynthToolTipUI;

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

//        1번~3번은 동일함
//        1번
//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;
//        System.out.println(students);

//        2번;
//        Student[] students = new Student[]{student1, student2};

//        3번: 생성과 선언을 동시에 할 수도 있다.
//        Student[] students = {student1, student2};

        Student[] students = {student1, student2};
        for (Student s: students) {
            System.out.println(s.name);
        }
    }
}
