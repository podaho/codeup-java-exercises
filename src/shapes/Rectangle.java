package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected double length;
//    protected double width;
//
//    public Rectangle() {
//        this.length = 0.0;
//        this.width = 0.0;
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        System.out.println("super getArea()");
//        return length*width;
//    }
//
//    public double getPerimeter() {
//        System.out.println("super getPerimeter()");
//        return 2*length+2*width;
//    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
