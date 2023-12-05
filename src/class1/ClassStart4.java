package class1;

import java.util.Arrays;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();


        student1.name = "학생1";
        student1.age = 26;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 24;
        student2.grade = 80;



//      자바에서의 대입은 항상 변수에 들어 있는 값을 복사한다.
//      참조 값만 복사가 된다 라는 것을 알아야한다.
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;


    }
}
