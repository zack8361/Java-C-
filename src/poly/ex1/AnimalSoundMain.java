package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();


        // 중복된 코드작성..
        dog.sound();
        cat.sound();
        cow.sound();
    }
}
