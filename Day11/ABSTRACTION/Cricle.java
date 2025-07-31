package Day11.ABSTRACTION;

public class Cricle extends Shape{

    int r;

    public Cricle(int r) {
        this.r = r;
    }

    @Override
    double area(){
        return Math.PI*r*r;
    }
}
