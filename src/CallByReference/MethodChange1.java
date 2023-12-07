package CallByReference;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : " + a);
        changeInteger(a);
        System.out.println("메서드 호출 후 : " + a);
    }

    private static void changeInteger(int alp) {
        alp = 20;
    }
}
