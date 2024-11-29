
import java.util.List;

public class ShapeUtil {
    /**
     * method to return info string.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder s = new StringBuilder();

        s.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                s.append(shape.getInfo());
                s.append("\n");
            }
        }

        s.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                s.append(shape.getInfo());
                s.append("\n");
            }
        }

        return s.toString();
    }
}