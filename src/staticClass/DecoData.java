package staticClass;

public class DecoData {
    private int instanceValue;
    private static int staticValue;


    //정적 메서드 -> 정적 메소드, 정적 변수만 사용 가능.
    public static void staticCall(){
        staticValue++; //정적 변수에 접근 가능..
        staticMethod(); //정적 메서드 접근 가능..
    }
    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
