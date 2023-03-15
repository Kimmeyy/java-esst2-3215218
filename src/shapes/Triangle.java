package src.shapes;

public class Triangle extends ShapeCollection implements Shape {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0.25 * Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    public String toString(){
        return "Triangle with sides " + a + ", " + b + ", " + c + " ";
    }
}
