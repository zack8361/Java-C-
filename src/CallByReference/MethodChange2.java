package CallByReference;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        changeRef(data1);

        System.out.println("data1 = " + data1.value);
    }

    private static void changeRef(Data datax) {
        datax.value = 20;
    }
}
