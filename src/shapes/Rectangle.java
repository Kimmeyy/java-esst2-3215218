package src.shapes;

public class Rectangle extends ShapeCollection implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width<=0 || height<=0){
            throw new InvalidRectangleDefinitionException(width, height);
        }
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public String toString(){
        return "Rectangle with width " + width + " and height " + height;
    }
}

