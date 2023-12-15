package poly.basic;



public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent) child; //업케스팅은 생략가능. 생략 권장.
        Parent parent1 = child;


    }
}
