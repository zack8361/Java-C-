package class1;

public class ClassStart3 {
    public static void main(String[] args) {

//      Student 클래스를 기반으로 새로운 객체(인스턴스) 를 생성한다.
        Student student1 = new Student();

//      객체의 참조값이 찍히는것. -> 이 참조값을 가지고 객체에 접근 가능한것.
        System.out.println(student1);

//      학생 설정
        student1.name = "학생1";
        student1.age = 26;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 24;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " / 나이 : " + student1.age);
        System.out.println("이름 : " + student2.name + " / 나이 : " + student2.age);

    }
}
