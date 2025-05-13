// Represents a regular pyramid with n sides.
package Shapes;

public class RegularPyramid extends Shape3D {
    private int nSides;
    private double sideLength;
    private double height;
    public RegularPyramid(int nSides, double sideLength, double height) {
        if (nSides < 3 || sideLength <= 0 || height <= 0) throw new IllegalArgumentException("Invalid pyramid parameters");
        this.nSides = nSides;
        this.sideLength = sideLength;
        this.height = height;
    }
    @Override
    public double getVolume() {
        double baseArea = (nSides * sideLength * sideLength) / (4 * Math.tan(Math.PI / nSides));
        return (baseArea * height) / 3.0;
    }
    @Override
    public double getSurfaceArea() {
        double baseArea = (nSides * sideLength * sideLength) / (4 * Math.tan(Math.PI / nSides));
        double apothem = height;
        double slantHeight = Math.sqrt((sideLength/2)*(sideLength/2) + height*height);
        double lateralArea = nSides * sideLength * slantHeight / 2.0;
        return baseArea + lateralArea;
    }
}
