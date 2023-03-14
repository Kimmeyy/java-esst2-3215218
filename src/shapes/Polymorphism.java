package src.shapes;

public class Polymorphism {
    public static void main(String[] args) {

        // überall wo ein Rectangle-Objekt erwartet wird, kann auch ein Square-Objekt genutzt werden
        Rectangle s = new Square(5);
        System.out.println(s.getArea());

    }
}
