//regular pyramid with n sides.
package Shapes;

public class RegularPyramid extends Shape3D {
    private RegularPolygon base;
    private double height;

    public RegularPyramid(int nSides, double sideLength, double height) {
        this.base = new RegularPolygon(nSides, sideLength);
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
        double slantHeight = Math.sqrt((base.getSideLength() / 2) * (base.getSideLength() / 2) + height * height);
        double lateralArea = base.getPerimeter() * slantHeight / 2.0;
        return base.getArea() + lateralArea;
    }
}
