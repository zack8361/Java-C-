package interfaceEx;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    @Override
    public void move() {
        System.out.println("개 이동");
    }

    @Override
    public void kong() {
        System.out.println();
    }
}
