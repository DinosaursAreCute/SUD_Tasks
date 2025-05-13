// Represents a cylinder.
package Shapes;

public class Cylinder extends Shape3D {
    private double radius, height;
    public Cylinder(double radius, double height) {
        if (radius <= 0 || height <= 0) throw new IllegalArgumentException("Radius and height must be positive");
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getVolume() { return Math.PI * radius * radius * height; }
    @Override
    public double getSurfaceArea() { return 2 * Math.PI * radius * (radius + height); }
}
