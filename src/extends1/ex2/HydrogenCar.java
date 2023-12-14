package extends1.ex2;

public class HydrogenCar extends Car {

    public void fillHydrogen(){
        System.out.println("수소 충전합니다");
    }


//  부모와 메서드 이름은 같지만 메소드를 재정의 하여 새로운 기능을 사용하고싶을때.
//  자식 타입에 오버라이딩 해서 해당 메소드가 있기때문에 부모 메서드에 잇는 move 는 호출되지않는 구조.
    @Override
    public void move(){
        System.out.println("수소차를 빠르게 이동합니다");
    }
}
