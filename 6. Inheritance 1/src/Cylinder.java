public class Cylinder extends Circle {
    private double height;

    /**
     * default constructor.
     */
    public Cylinder() {
    }

    /**
     * constructor with height.
     * @param height the height input
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * constructor with two inputs.
     * @param height the height input
     * @param radius the radius input
     */
    public Cylinder(double height, double radius) {
        this.height = height;
        this.setRadius(radius);
    }

    /**
     * constructor with all inputs.
     * @param height the height input
     * @param radius the radius input
     * @param color the color input
     */
    public Cylinder(double height, double radius, String color) {
        this.height = height;
        this.setRadius(radius);
        this.setColor(color);
    }

    /**
     * method to get cylinder height.
     * @return the height of the cylinder
     */
    public double getHeight() {
        return height;
    }

    /**
     * method to modify the cylinder height.
     * @param height the height to modify
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * method to get cylinder volume.
     * @return the calculated volume
     */
    public double getVolume() {
        return this.getArea() * height;
    }

    /**
     * method override the toString() method from Circle class.
     * @return structured string
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /**
     * method override the getArea() method from Circle class.
     * @return new area
     */
    @Override
    public double getArea() {
        return this.getRadius() * this.getRadius() * pi * height * 2;
    }
}