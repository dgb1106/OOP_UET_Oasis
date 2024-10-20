
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * method to get all info of the shapes added.
     * @return s the output string
     */
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Layer of crazy shapes:");
        for (Shape shape : shapes) {
            s.append("\n");
            s.append(shape.toString());
        }
        return s.toString();
    }

    /**
     * method to remove all duplicates.
     */
    public void removeDuplicates() {
        HashSet<Shape> set = new HashSet<>();
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape shape : this.shapes) {
            if (set.contains(shape)) {
                continue;
            }
            set.add(shape);
            uniqueShapes.add(shape);
        }
        this.shapes = uniqueShapes;
    }
}