public class Main {
    public static void main(String[] args) {
            Car[] cars = {new Car("Bugati", "black"),
                 new Car("Ford", "blue"),
                 new Car("Hyundai", "white")};
    
    for(Car car : cars){
        car.drive();
    }
    }

}
