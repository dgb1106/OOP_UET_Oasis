
import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
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
     * method to retrieve the distance between two points.
     * @param newPoint the other point
     * @return the calculated distance
     */
    public double distance(Point newPoint) {
        double dx = newPoint.getPointX() - pointX;
        double dy = newPoint.getPointY() - pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * the method to check if two points are equal.
     * @return the status (true of false)
     */
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            if (this.pointX == p.getPointX() && this.pointY == p.getPointY()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}