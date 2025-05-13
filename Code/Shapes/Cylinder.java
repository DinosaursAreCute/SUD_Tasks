//a cylinder.
package Shapes;

public class Cylinder extends Shape3D {
    private double height;
    private Circle base;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        setHeight(height);
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    @Override
    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * base.getArea() + base.getPerimeter() * height;
    }
}
