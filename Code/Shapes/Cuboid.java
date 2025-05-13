// Represents a cuboid (rectangular prism).
package Shapes;

public class Cuboid extends Shape3D {
    private double width, height, depth;
    public Cuboid(double width, double height, double depth) {
        if (width <= 0 || height <= 0 || depth <= 0) throw new IllegalArgumentException("All dimensions must be positive");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    @Override
    public double getVolume() { return width * height * depth; }
    @Override
    public double getSurfaceArea() { return 2 * (width * height + width * depth + height * depth); }
}
