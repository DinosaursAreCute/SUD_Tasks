package Shapes;

public class Pyramid extends Rectangle {
    private double height;

    public Pyramid(double baseLength, double baseDepth, double height) {
        super(baseLength, baseDepth);
        setHeight(height);
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height / 3;
    }

    // Oberfläche = Grundfläche + Mantelfläche (4 Dreiecke)
    public double getSurfaceArea() {
        double slantHeightA = Math.sqrt((getWidth() / 2) * (getWidth() / 2) + height * height);
        double slantHeightB = Math.sqrt((getHeight() / 2) * (getHeight() / 2) + height * height);
        double sideAreaA = getWidth() * slantHeightB;
        double sideAreaB = getHeight() * slantHeightA;
        return getArea() + sideAreaA + sideAreaB;
    }
}