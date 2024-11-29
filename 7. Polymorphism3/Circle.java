
import java.awt.Graphics;
import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * the default constructor with full parameters.
     * @param center the center of the circle
     * @param radius the radius of the circle
     * @param color the color of the circle
     * @param filled the status of filling
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Circle(Point center, double radius, double velX, double velY, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
        this.velX = (int) velX;
        this.velY = (int) velY;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + this.center.toString() + ",radius=" + this.radius 
        + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * method to check if two circle equal.
     * @param o the object to check
     */
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return (this.center.equals(c.getCenter())
            && Math.abs(this.radius - c.getRadius()) <= 0.001);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(center, radius);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.getColorFromString(color));
        g.fillOval((int)center.getPointX(), (int)center.getPointY(), 2 * (int)radius, 2 * (int)radius);
    }

    public void checkCollision(int panelWidth, int panelHeight) {
        if (center.getPointX() < 0 || center.getPointX() + radius > panelWidth) {
            velX = -velX;
        }
        if (center.getPointY() < 0 || center.getPointY() + radius > panelHeight) {
            velY = -velY;
        }
    }

    @Override
    public void move(int panelWidth, int panelHeight) {
        center.setPointX(center.getPointX() + velX);
        center.setPointY(center.getPointY() + velY);
        checkCollision(panelWidth, panelHeight);
    }
}