//a circle
package Shapes;

public class Circle extends Shape2D {
    private double radius;
    public Circle(double radius) {
        super(radius,radius);
        setRadius(radius);
    }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be positive");
        this.radius = radius;
    }
}
