package CallByReference;

public class Method2 {
    public static void main(String[] args){
       Student student =  createStudent("이찬호",26,10);
       Student student2 =  createStudent("kong",23,4);

        printStudent(student);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void printStudent(Student student){
        System.out.println(student.name);

    }
}
