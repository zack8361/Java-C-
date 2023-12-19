package poly.ex1;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            getSound(animal);
        }
    }
    private static void getSound(Animal animal) {
        System.out.println("동물 소리 호출");
        animal.sound();
    }
}
