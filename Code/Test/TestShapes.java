// Test class for 2D and 3D shapes
package Test;

import Shapes.*;

public class TestShapes {
    public static void main(String[] args) {
        // 2D Shapes
        Rectangle rect = new Rectangle(4.0, 7.7);
        System.out.println("Rectangle Area: " + rect.getArea() + ", Perimeter: " + rect.getPerimeter());
        Circle circle = new Circle(2.5);
        System.out.println("Circle Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

        // 3D Shapes
        Cuboid cuboid = new Cuboid(4.0, 7.7, 6.0);
        System.out.println("Cuboid Surface: " + cuboid.getSurfaceArea() + ", Volume: " + cuboid.getVolume());
        Cylinder cylinder = new Cylinder(2.5, 6.0);
        System.out.println("Cylinder Surface: " + cylinder.getSurfaceArea() + ", Volume: " + cylinder.getVolume());
        Sphere sphere = new Sphere(2.5);
        System.out.println("Sphere Surface: " + sphere.getSurfaceArea() + ", Volume: " + sphere.getVolume());
        RegularPrism prism = new RegularPrism(9, 3.0, 6.0);
        System.out.println("Regular Prism Surface: " + prism.getSurfaceArea() + ", Volume: " + prism.getVolume());
        RegularPyramid pyramid = new RegularPyramid(4, 5.0, 6.0);
        System.out.println("Regular Pyramid Surface: " + pyramid.getSurfaceArea() + ", Volume: " + pyramid.getVolume());
        Cone cone = new Cone(2.5, 6.0);
        System.out.println("Cone Surface: " + cone.getSurfaceArea() + ", Volume: " + cone.getVolume());
    }
}
