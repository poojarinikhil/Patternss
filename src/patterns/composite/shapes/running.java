package patterns.composite.shapes;
import patterns.composite.shapes.Circle;

import java.awt.*;

public class running {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED)));
    }
}
