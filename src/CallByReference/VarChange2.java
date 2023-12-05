package CallByReference;

public class VarChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;

//      data1 에 있는 인스턴스를 복사하는것이아니라 -> 참조 값만 복사하는것이다.
        Data data2 = data1;
        System.out.println("data1 참조값 = " + data1);
        System.out.println("data2 참조값 = " + data2);
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);

        data1.value = 20;

    }
}
