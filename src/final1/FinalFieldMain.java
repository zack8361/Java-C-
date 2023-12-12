package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println("필드 초기화");
        FieldInit fieldInit = new FieldInit();



        //자바에서는 Static Final 이 붙은 것을 상수라고한다.
        System.out.println("상수에 접근");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
