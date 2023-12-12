package staticClass;

public class Car {
    private static int cnt;
    String name;

    public Car(String name){
        cnt++;
        this.name = name;
        System.out.println("차량 구입, 이름 : " + this.name);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량수 : " + cnt);
    }
}
