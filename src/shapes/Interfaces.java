package src.shapes;

public class Interfaces {
    public static void main(String[] args) {

        var circle = new Circle(5);
        var rectangle = new Rectangle(5,10);
        var square = new Square(7);
        var triangle = new Triangle(3,4,5);

        describeShape(circle);
        describeShape(rectangle);
        describeShape(square);
        describeShape(triangle);
    }

    static void describeShape(Shape s){
        String description = s.toString() + " with area " + s.getArea() + " and perimeter " + s.getPerimeter();
        System.out.println(description);
    }
}
