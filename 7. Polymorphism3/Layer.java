
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

public class Layer extends JPanel {
    private List<Shape> shapes = new ArrayList<>();
    private Random rand = new Random();

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

    private String getRandomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "black", "white"};
        return colors[rand.nextInt(colors.length)];
    }

    public void addCircle() {
        int radius = rand.nextInt(30) + 10;
        int x = rand.nextInt(getWidth() - radius);
        int y = rand.nextInt(getHeight() - radius);
        int velX = rand.nextInt(5) + 1;
        int velY = rand.nextInt(5) + 1;
        String color = getRandomColor();
        shapes.addShape(new Circle(new Point(x, y), radius, color, getFocusTraversalKeysEnabled()))
    }

    @Override
    public void  paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}