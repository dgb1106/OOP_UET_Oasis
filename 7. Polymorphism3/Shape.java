
import java.awt.Color;
import java.awt.Graphics;



public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected int velX, velY;

    public Shape() {
        color = null;
        filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }

    public abstract void draw(Graphics g);

    public abstract void move(int panelWidth, int panelHeight);

    public Color getColorFromString(String colorName) {
        switch (colorName.toLowerCase()) {
            case "red":
                return Color.RED;
            case "blue":
                return Color.BLUE;
            case "green":
                return Color.GREEN;
            case "yellow":
                return Color.YELLOW;
            case "black":
                return Color.BLACK;
            case "white":
                return Color.WHITE;
            default:
                throw new AssertionError();
        }
    }
}