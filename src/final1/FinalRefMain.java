package final1;

public class FinalRefMain {
    public static void main(String[] args) {

//      참조형 변수를 Final로 선언한다.
        final Data data = new Data();


//      참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
