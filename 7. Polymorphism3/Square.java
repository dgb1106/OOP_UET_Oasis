
import java.util.Objects;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    /**
     * the method to check if the two square are equal.
     * @param o the object to compare
     * @return true or false
     */
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square s = (Square) o;
            return (Math.abs(this.length - s.getLength()) <= 0.001
            && this.topLeft.equals(s.getTopLeft()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, topLeft);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + this.topLeft.toString() + ",side=" 
        
        
        + this.length + ",color=" + this.color
        + ",filled=" + this.filled + "]";
    }
}