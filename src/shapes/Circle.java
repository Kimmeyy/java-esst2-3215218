package src.shapes;

public class Circle extends ShapeCollection implements Shape {

    private int radius;

    public Circle(int radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


    // Wenn man die equals-Methode überschreibt, muss auch die hashcode-Methode überschrieben werden
    public boolean equals(Object o){
        if(!(o instanceof Circle)){
            return false;
        }
        Circle circle = (Circle) o;
        return this.radius == circle.radius;
    }

    public int hashCode(){
        return radius;
    }

    public String toString(){
        return "Circle with radius " + radius;
    }
}
