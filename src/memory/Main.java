package memory;

public class Main {
    public static void main(String[] args) {

        Ex01 ex01 = new Ex01("이찬호");
        Ex01 ex02 = new Ex01("이찬호");
        Ex01 ex03 = new Ex01("이찬호");
        Ex01 ex04 = new Ex01("이찬호");
        Ex01 ex05 = new Ex01("이찬호");
        Ex01 ex06 = new Ex01("이찬호");


//      스태틱 변수를 가져다 썼구나 라는것을 바로 알 수 있음.
        System.out.println(Ex01.count);
    }
}
