package src.shapes;

public class InvalidRectangleDefinitionException extends RuntimeException {
    public InvalidRectangleDefinitionException(int width, int height){
        super("Invalid rectangle with " + width + " and " + height);
    }
}
