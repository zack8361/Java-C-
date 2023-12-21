package interfaceEx.ex06;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹 쨱");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
