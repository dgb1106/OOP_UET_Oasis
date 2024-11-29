public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * constructor.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1 == null || p2 == null || p3 == null) {
            throw new RuntimeException("Points cannot be null.");
        }
        if (isSamePoint(p1, p2) || isSamePoint(p1, p3) || isSamePoint(p2, p3)) {
            throw new RuntimeException("Two points are identical, cannot form a triangle.");
        }
        if (isStraight(p1, p2, p3)) {
            throw new RuntimeException("The points are collinear, cannot form a triangle.");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }    

    private boolean isSamePoint(Point p1, Point p2) {
        return p1.equals(p2);
    }

    private boolean isStraight(Point p1, Point p2, Point p3) {
        return (p2.getPointY() - p1.getPointY()) * (p3.getPointX() - p1.getPointX())
               == (p3.getPointY() - p1.getPointY()) * (p2.getPointX() - p1.getPointX());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        return Math.abs(this.p1.getPointX() * (this.p2.getPointY() - this.p3.getPointY())
        + this.p2.getPointX() * (this.p3.getPointY() - this.p1.getPointY()) 
        + this.p3.getPointX() * (this.p1.getPointY() - this.p2.getPointY())) / 2.0;
    }

    @Override
    public double getPerimeter() {
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);
        return a + b + c;
    }

    @Override
    public String getInfo() {
        StringBuilder s = new StringBuilder();
        s.append("Triangle[(");
        s.append(String.format("%.2f", this.p1.getPointX()));
        s.append(",");
        s.append(String.format("%.2f", this.p1.getPointY()));
        s.append("),(");
        s.append(String.format("%.2f", this.p2.getPointX()));
        s.append(",");
        s.append(String.format("%.2f", this.p2.getPointY()));
        s.append("),(");
        s.append(String.format("%.2f", this.p3.getPointX()));
        s.append(",");
        s.append(String.format("%.2f", this.p3.getPointY()));
        s.append(")]");
        return s.toString();
    }
}