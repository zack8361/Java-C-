package CallByReference;

public class ex01 {
    public static void main(String[] args) {


//      변수 a 자체를 대입하는게아니라 a 에 있는 값을 복사해서 b에 대입한다.
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("--------------------------------");


        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("--------------------------------");


        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
