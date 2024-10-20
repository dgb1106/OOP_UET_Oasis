public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
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

    @Override
    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length
        + ",color=" + this.color + ",filled=" + this.filled + "]";
    }
}