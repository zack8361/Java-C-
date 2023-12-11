package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name,int age){
        this(name,age,50);
    }
    MemberConstruct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void printMembers(MemberConstruct[] memberConstructs){
        for (MemberConstruct s : memberConstructs) {
            System.out.println(s.name + " / " + s.age + " / " + s.grade);
        }
    }
}
