package interfaceEx.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차 설정" + car);
        this.car = car;
    }
    public void drive(){
        System.out.println("자동차 운전을 시작합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
