// Abstract base class for 2D shapes. Requires area and perimeter calculation.
package Shapes;

public abstract class Shape2D {
    private double width;
    private double height;
    Shape2D(double width, double height) {
        setHeight(height);
        setWidth(width);
    }
    public void setWidth(double width) {
        if (width <= 0) throw new IllegalArgumentException("Width must be positive");
        this.width = width;
    }
    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public abstract double getArea();
    public abstract double getPerimeter();
}
