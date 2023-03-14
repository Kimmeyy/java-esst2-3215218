package src.shapes;

import src.shapes.Circle;
import src.shapes.Rectangle;

public class ShapesExamples {
    public static void main(String[] args) {

        var circle = new Circle(5);
        var circleArea = circle.getArea();

        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        var rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        var square = new Rectangle(5, 5);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        System.out.println("Former rectangle: " + rectangle.getArea());
        rectangle=square;
        System.out.println("Variable now points to the square: " + rectangle.getArea());
    }
}
