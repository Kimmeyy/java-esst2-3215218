package src.streams;

import src.shapes.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class ShapeStreams {

    public static void main(String[] args) {

        var stream = new ShapeStreams();

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

        stream.getSumAsStream(collection1);
        stream.getSumAsStream(collection2);

        stream.getSumAsStreamEasier(collection1);
        stream.getSumAsStreamEasier(collection2);
    }

    public void getSumAsStream(Collection<Shape> shapes){
        // ODER: shapes.stream()
        var collectionStream1 = Stream.of(shapes)
                .mapToInt(shape -> (int) getSum(shape))
                .reduce(0, Integer::sum);
        System.out.println(collectionStream1);
    }

    public double getSum(Collection<Shape> shapes){
        double erg = 0;
        for(var shape : shapes){
            erg = erg + shape.getArea();
        }
        return erg;
    }

    public void getSumAsStreamEasier(Collection<Shape> shapes) {
        double sum = shapes.stream()
                // hiermit mapped man die Shapes auf den Flächenwert
                .mapToDouble(Shape::getArea)
                .sum();
        System.out.println(sum);
    }
}
