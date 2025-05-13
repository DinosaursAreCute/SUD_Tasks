//a rectangle
package Shapes;

public class Rectangle extends Shape2D {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        if (width <= 0) throw new IllegalArgumentException("Width must be positive");
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
