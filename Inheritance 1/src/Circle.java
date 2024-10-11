public class Circle {
    private double radius;
    private String color;
    protected static final double pi = 3.14;

    /**
     * default constructor.
     */
    public Circle() {
    }

    /**
     * constructor with radius parameter.
     * @param radius the input radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * constructor with radius and color.
     * @param radius the input radius
     * @param color the input color
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * method to get the circle radius.
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * method to modify the circle radius.
     * @param radius the modified radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * method to get the color of the circle.
     * @return the color of the circle
     */
    public String getColor() {
        return color;
    }

    /**
     * method to modify the color of the circle.
     * @param color the modified color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * method to get the circle area.
     * @return the calculated area
     */
    public double getArea() {
        return radius * radius * pi;
    }

    /**
     * method to get structured string.
     * @return the structured string
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}