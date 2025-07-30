package Day10.Inheriance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.eat();
        dog.speak();
        cat.speak();
        plant.photosynthesize();

    }
}
