import BadCode.AreaCalculator;
import BadCode.Rectangle;
import BetterCode.Circle;
import BetterCode.NewAreaCalculator;
import BetterCode.Triangle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

     //bad code example commented below
        //version 1
            //BadCode.Square square1 = new BadCode.Square(3);
            //BadCode.AreaCalculator areaCalculator = new BadCode.AreaCalculator(square1);
            //areaCalculator.printArea();

           /* BadCode.Triangle t1 = new BadCode.Triangle(5,10);
            BadCode.AreaCalculator areaCalculator = new BadCode.AreaCalculator(t1);
            areaCalculator.printArea(false);

            BadCode.Square square1 = new BadCode.Square(3);
             areaCalculator.setSquare(square1);
            areaCalculator.printArea(true);*/

            //new functionality : introduce rectangle :
         /*Rectangle rectangle = new Rectangle(10,20);
        AreaCalculator areaCalculator = new AreaCalculator(rectangle);
        areaCalculator.printArea(3);*/

        //good code below

        Triangle t1 = new Triangle(10,20) ;
        NewAreaCalculator newAreaCalculator = new NewAreaCalculator();// ishape shape = new triable()
        newAreaCalculator.setShape(t1);
        newAreaCalculator.printAreaOfShape();

        Circle c1 = new Circle(10);
        newAreaCalculator.setShape(c1);
        newAreaCalculator.printAreaOfShape();



    }
}