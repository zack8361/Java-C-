package interfaceEx.ex06;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        abstractAnimal.sound();
    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
    }
}
