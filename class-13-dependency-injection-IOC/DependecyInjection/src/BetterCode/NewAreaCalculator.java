package BetterCode;

public class NewAreaCalculator {

    private IShape shape;

    public void setShape(IShape shape) {
        this.shape = shape;
    }

    public void printAreaOfShape()
    {
        shape.printArea();
    }
}
