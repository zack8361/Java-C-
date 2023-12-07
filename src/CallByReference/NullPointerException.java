package CallByReference;

public class NullPointerException {
    public static void main(String[] args) {
        Data data = null;

//      NULL 에 . 을찍으면 터지는 오류 = NullPointerException
        data.value = 10;

        System.out.println(data.value);
    }
}
