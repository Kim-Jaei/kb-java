package ch07.sec10.exam02;
public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();

        animalSound(dog); // 멍멍 출력
        animalSound(cat); // 야옹 출력
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
