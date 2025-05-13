// Represents a rectangle. Validates side lengths.
package Shapes;

public class Rectangle extends Shape2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException("Width and height must be positive");
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
