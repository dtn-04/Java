package Day11.ABSTRACTION;

public class Main {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(6, 7);

        System.out.println(cricle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());

    }
}
