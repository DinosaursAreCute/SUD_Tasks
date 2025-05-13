//a circular cone.
package Shapes;

public class Cone extends Shape3D {
    private Circle base;
    private double height;

    public Cone(double radius, double height) {
        this.base = new Circle(radius);
        setHeight(height);
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (base.getArea() * height) / 3.0;
    }

    @Override
    public double getSurfaceArea() {
        double slant = Math.sqrt(base.getRadius() * base.getRadius() + height * height);
        return base.getArea() + Math.PI * base.getRadius() * slant;
    }
}
