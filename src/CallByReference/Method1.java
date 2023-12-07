package CallByReference;

public class Method1 {
    public static void main(String[] args){
        Student student1 = new Student();
        initStudent(student1,"이찬호",26,100);

        Student student2 = new Student();
        initStudent(student2,"kong",24,90);

        printStudent(student1);
        printStudent(student2);
    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student){
        System.out.println(student.name);
        
    }
}
