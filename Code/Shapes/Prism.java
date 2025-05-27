package Shapes;
    public class Prism extends Shape3D{
    private double height;
    private Rectangle base;
    public Prism(Rectangle base, double height) {
        setHeight(height);
        setBase(base);
    }

        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            if(height <= 0) throw new IllegalArgumentException("Height must be positive");
            else this.height = height;
        }

        public double getBase() {
            return base.getArea();
        }
        public void setBase(Rectangle base) {
            this.base = base;
        }

        public double getVolume(){
        return base.getArea() * height;
    }
        public double getSurfaceArea(){
        return 2 * getBase() + base.getPerimeter() * height;
        }



}
