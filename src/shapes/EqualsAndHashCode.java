package src.shapes;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        int x = 4711;
        int y = 4711;
        System.out.println(x==y);
        
        var circle1 = new Circle(5);
        var circle2 = new Circle(5);
        System.out.println(circle1==circle2);
        System.out.println(circle1.equals(circle2));

    }
}
