package src.shapes;

public class Square extends Rectangle {

    private int x;
    public Square(int x) {
        super(x, x);
        this.x=x;
    }

    public String toString(){
        return "Square with width " + x;
    }
}
