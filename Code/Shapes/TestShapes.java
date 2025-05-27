package Shapes;

public class TestShapes {
    private static final double EPSILON = 0.01;

    public static void main(String[] args) {
        // Rechteck-Prisma
        Rectangle baseRect = new Rectangle(7.7, 4.0);
        Prism prismRect = new Prism(baseRect, 6.0);
        check("Prism Rechteck Oberfläche", prismRect.getSurfaceArea(), 202.0);
        check("Prism Rechteck Volumen", prismRect.getVolume(), 184.8);

        // 9-Eck-Prisma
        RegularPolygon basePoly9 = new RegularPolygon(9, 3.0);
        RegularPrism prismPoly9 = new RegularPrism(basePoly9, 6.0);
        check("Prism 9-Eck Oberfläche", prismPoly9.getSurfaceArea(), 273.273);
        check("Prism 9-Eck Volumen", prismPoly9.getVolume(), 333.819);

        // Kreiskegel
        Cone cone = new Cone(2.5, 6.0);
        check("Kegel Oberfläche", cone.getSurfaceArea(), 70.686);
        check("Kegel Volumen", cone.getVolume(), 39.27);

        // Pyramide mit 3 Seiten
        RegularPolygon basePoly3 = new RegularPolygon(3, 5.0);
        RegularPyramid pyramid3 = new RegularPyramid(basePoly3, 6.0);
        check("Pyramide 3 Oberfläche", pyramid3.getSurfaceArea(), 57.109);
        check("Pyramide 3 Volumen", pyramid3.getVolume(), 21.651);

        // Pyramide mit 4 Seiten
        RegularPolygon basePoly4 = new RegularPolygon(4, 5.0);
        RegularPyramid pyramid4 = new RegularPyramid(basePoly4, 6.0);
        check("Pyramide 4 Oberfläche", pyramid4.getSurfaceArea(), 90.0);
        check("Pyramide 4 Volumen", pyramid4.getVolume(), 50.0);

        // Pyramide mit 7 Seiten
        RegularPolygon basePoly7 = new RegularPolygon(7, 5.0);
        RegularPyramid pyramid7 = new RegularPyramid(basePoly7, 6.0);
        check("Pyramide 7 Oberfläche", pyramid7.getSurfaceArea(), 229.694);
        check("Pyramide 7 Volumen", pyramid7.getVolume(), 181.696);

        // Kugel
        Sphere sphere = new Sphere(2.5);
        check("Kugel Oberfläche", sphere.getSurfaceArea(), 78.54);
        check("Kugel Volumen", sphere.getVolume(), 65.45);
    }

    private static void check(String name, double actual, double expected) {
        if (Math.abs(actual - expected) < EPSILON) {
            System.out.println(name + " OK (" + actual + ")");
        } else {
            System.out.println(name + " FEHLER: erwartet " + expected + ", erhalten " + actual);
        }
    }
}
