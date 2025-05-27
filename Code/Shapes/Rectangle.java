//a rectangle
package Shapes;

public class Rectangle extends Shape2D {


    public Rectangle(double width, double height) {
        super(width, height);
    }
    @Override
    public double getArea() { return getHeight() * getWidth();}
    @Override
    public double getPerimeter() { return 2 * (getWidth() + getHeight()); }

}
