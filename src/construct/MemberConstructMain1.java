package construct;

public class MemberConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("CHAN",26,100);
        MemberConstruct member2 = new MemberConstruct("KONG",24);

        MemberConstruct[] memberConstructs = {member1,member2};
        member1.printMembers(memberConstructs);
    }
}
