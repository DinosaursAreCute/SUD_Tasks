// Represents a right circular cone.
package Shapes;

public class Cone extends Shape3D {
    private double radius, height;
    public Cone(double radius, double height) {
        if (radius <= 0 || height <= 0) throw new IllegalArgumentException("Radius and height must be positive");
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getVolume() { return (Math.PI * radius * radius * height) / 3.0; }
    @Override
    public double getSurfaceArea() {
        double slant = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slant);
    }
}
