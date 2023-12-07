package CallByReference;

public class NULL {
    public static void main(String[] args) {
//      참조 값이 없어.
        Data data = null;
        System.out.println(data);
        data = new Data();
        System.out.println(data);


//      아무도 참조하지 않는 인스턴스는 -> 메모리 용량만 차지한다. -> 가비지 컬렉션이 제거한다.(자바의 큰 장점)
        data = null;

        System.out.println(data);
    }
}
