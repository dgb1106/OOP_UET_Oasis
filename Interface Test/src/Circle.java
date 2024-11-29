public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
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
        return radius * radius * Circle.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Circle.PI;
    }

    @Override
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Circle[(");
        s.append(String.format("%.2f", this.center.getPointX()));
        s.append(",");
        s.append(String.format("%.2f", this.center.getPointY()));
        s.append("),r=");
        s.append(String.format("%.2f", radius));
        s.append("]");
        return s.toString();
    }
}