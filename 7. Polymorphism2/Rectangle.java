
import java.util.Objects;



public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;
    
    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * constructor with full parameters.
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     * @param color the color of the rectangle
     * @param filled the status of the rectangle is filled or not
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * the default constructor with all parameters.
     * @param topLeft the topLeft point
     * @param width the width of the rectangle
     * @param length the length of the rectangle
     * @param color the color of the rectangle
     * @param filled the status of the filling
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }   

    /**
     * the method to check if the two rectangle are equal.
     * @param o the object to compare
     * @return true or false
     */
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            return (Math.abs(this.length - r.getLength()) <= 0.001
            && Math.abs(this.width - r.getWidth()) <= 0.001
            && this.topLeft.equals(r.getTopLeft()));
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft.toString() + ",width=" + this.width 
        + ",length=" + this.length
        + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}