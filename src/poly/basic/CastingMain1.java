package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {

//  부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        poly.parentMethod();

//  다운 캐스팅 (부모타입 -> 자식타입으로 낮춘다)
        Child child = (Child) poly;
        child.childMethod();

    }
}
