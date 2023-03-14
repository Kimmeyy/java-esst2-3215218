package src.shapes;

public class ToStringExamples {
    public static void main(String[] args) {

        Object c = new Circle(42);

        // diese beiden Aufrufe sind identisch
        System.out.println(c.toString());
        System.out.println(c);

    }
}
