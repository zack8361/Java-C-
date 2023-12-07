package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1,"kong",25,100);
    }

    static void initMember(MemberInit memberInit, String name, int age, int grade){
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }
}
