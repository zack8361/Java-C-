package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();

//      자식에게 없으면 부모로 올라가서 찾는다.
        electricCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
        hydrogenCar.move();
    }
}
