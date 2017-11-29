package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.println("overridden getArea()");
        return width*width;
    }

    @Override
    public double getPerimeter() {
        System.out.println("overridden getPerimeter()");
        return width*4;
    }
}
