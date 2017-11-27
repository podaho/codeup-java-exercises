package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input inp = new Input();
        do {
            Circle c = new Circle(inp.getDouble("Enter Circle Radius:"));
            System.out.println("Area of circle: "+c.getArea());
            System.out.println("Circumference of circle: "+c.getCircumference());
        } while(inp.yesNo("Create Another Circle?"));
        System.out.printf("You created %d circles!\n", Circle.getNumCirc());
    }
}
