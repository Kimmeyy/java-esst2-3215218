package src.shapes;

public class RecordsExample {
    public static void main(String[] args) {

        Point point1 = new Point(0,0);
        Point point2 = new Point(3,4);
        Line line = new Line(point1, point2);

        // Alternativ:
        // var line = new Line(new Point(0,0), new Point(3,4));
        System.out.println(line.getLength());

    }
}
