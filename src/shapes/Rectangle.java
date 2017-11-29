package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("super getArea()");
        return length*width;
    }

    public double getPerimeter() {
        System.out.println("super getPerimeter()");
        return 2*length+2*width;
    }
}
