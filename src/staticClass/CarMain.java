package staticClass;

import static staticClass.Car.*;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("k3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        showTotalCars();
    }
}
