//regular pyramid with n sides.
package Shapes;

public class RegularPyramid extends Shape3D {
    private Shapes.RegularPolygon base;
    private double height;

    public RegularPyramid(int nSides, double sideLength, double height) {
        this.base = new Shapes.RegularPolygon(nSides, sideLength);
        setHeight(height);
    }
    public RegularPyramid(RegularPolygon base, double height){
        this.base = base;
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
        // Apothem der Basis
        double n = base.getNumSides();
        double s = base.getSideLength();
        double apothem = s / (2 * Math.tan(Math.PI / n));
        // Seitenhöhe (slant height)
        double slantHeight = Math.sqrt(apothem * apothem + height * height);
        double lateralArea = base.getPerimeter() * slantHeight / 2.0;
        return base.getArea() + lateralArea;
    }
}
