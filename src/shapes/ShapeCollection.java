package src.shapes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ShapeCollection {

    public static void main(String[] args) {

        var circle = new Circle(5);
        var rectangle = new Rectangle(5, 10);
        var square = new Square(9);
        var triangle = new Triangle(3, 4, 5);

        List<Shape> collection1 = new ArrayList<>();
        collection1.add(circle);
        collection1.add(rectangle);
        collection1.add(square);
        collection1.add(triangle);

        var collection2 = new HashSet<Shape>();
        collection2.add(circle);
        collection2.add(rectangle);
        collection2.add(square);
        collection2.add(triangle);

        var shapeCollection = new ShapeCollection();
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());
        System.out.println(shapeCollection.getSum(collection1));
        System.out.println(shapeCollection.getSum(collection2));

    }

    public double getSum(Collection<Shape> shapes){
        double erg = 0;
        for(var shape : shapes){
            erg = erg + shape.getArea();
        }
        return erg;
    }
}
