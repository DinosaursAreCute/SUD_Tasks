//a cuboid
package Shapes;

public class Cuboid extends Shape3D {
    private double width, height, depth;
    public Cuboid(double width, double height, double depth) {
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    public void setWidth(double width) {
        if (width <= 0) throw new IllegalArgumentException("Width must be positive");
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    public void setDepth(double depth) {
        if (depth <= 0) throw new IllegalArgumentException("Depth must be positive");
        this.depth = depth;
    }

    @Override
    public double getVolume() { return width * height * depth; }
    @Override
    public double getSurfaceArea() { return 2 * (width * height + width * depth + height * depth); }
}
