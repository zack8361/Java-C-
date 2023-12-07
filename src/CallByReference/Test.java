package CallByReference;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name ="이찬호";
        System.out.println(student1.name);
        Student student2 = new Student();
        student2.name = "kong";
    }
}
