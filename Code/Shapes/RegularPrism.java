// Represents a regular prism with n-sided polygon base.
package Shapes;

public class RegularPrism extends Shape3D {
    private int nSides;
    private double sideLength;
    private double height;
    public RegularPrism(int nSides, double sideLength, double height) {
        if (nSides < 3 || sideLength <= 0 || height <= 0) throw new IllegalArgumentException("Invalid prism parameters");
        this.nSides = nSides;
        this.sideLength = sideLength;
        this.height = height;
    }
    @Override
    public double getVolume() {
        double baseArea = (nSides * sideLength * sideLength) / (4 * Math.tan(Math.PI / nSides));
        return baseArea * height;
    }
    @Override
    public double getSurfaceArea() {
        double baseArea = (nSides * sideLength * sideLength) / (4 * Math.tan(Math.PI / nSides));
        double perimeter = nSides * sideLength;
        return 2 * baseArea + perimeter * height;
    }
}
