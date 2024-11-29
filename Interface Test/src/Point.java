public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * method to calculate the distance between two points.
     */
    public double distance(Point other) {
        double dx = other.getPointX() - this.pointX;
        double dy = other.getPointY() - this.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }
}