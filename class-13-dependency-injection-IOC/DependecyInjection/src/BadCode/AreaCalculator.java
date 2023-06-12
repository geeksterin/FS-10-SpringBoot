package BadCode;

import BadCode.Rectangle;
import BadCode.Square;
import BadCode.Triangle;

public class AreaCalculator {

    private Square square;
    private Triangle triangle;

    private Rectangle rectangle;

    public AreaCalculator(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public AreaCalculator(Square square) {
        this.square = square;
    }

    public AreaCalculator(Triangle triangle) {
        this.triangle = triangle;
    }

    public void printArea(int choice)
   {
       if(choice == 1)
       {
           System.out.println(square.getSide()*square.getSide());
       }
       else if(choice == 2)
       {
           System.out.println(0.5 * triangle.getBase()* triangle.getHeight());
       }
       else if(choice == 3)
       {
           System.out.println(rectangle.getLength()*rectangle.getBreath());
       }

   }
}
