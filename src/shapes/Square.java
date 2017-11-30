package shapes;

public class Square extends Quadrilateral implements Measurable{
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("overridden getArea()");
//        return width*width;
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("overridden getPerimeter()");
//        return width*4;
//    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }

    @Override
    public double getArea() {
        return this.length*this.length;
    }
}
