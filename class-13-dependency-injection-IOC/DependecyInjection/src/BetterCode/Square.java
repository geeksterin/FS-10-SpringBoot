package BetterCode;

public class Square implements IShape{

    private int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void printArea()
    {
        System.out.println(side*side);
    }
}
