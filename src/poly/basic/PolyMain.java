package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
//      부모 타입의 변수가 자식 인스턴스를 참조할 수 있다.
        Parent poly = new Child();
        
//      반대로 자식 타입의 변수는 부모를 참조할 수 없다.
//       Child poly2 = new Parent();
    }
}
