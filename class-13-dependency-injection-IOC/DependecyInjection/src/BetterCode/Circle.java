package BetterCode;

public class Circle implements IShape{

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println(3.14*radius*radius);
    }
}
