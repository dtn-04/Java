

public class Car {
    String make = "Bugati";
    String model = "VietNam";
    int year = 2025;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("The car start");
    }

    void stop(){
        isRunning = false;
        System.out.println("Stop");
    }
}
