package shapes;

public class Circle {
    private double radius;
    private static int numCirc = 0;

    public Circle(double radius) {
        this.radius = radius;
        numCirc++;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
    public static int getNumCirc() {
        return numCirc;
    }
}
