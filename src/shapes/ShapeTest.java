package shapes;

public class ShapeTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Rectangle(4,5);
        System.out.println("Perimeter of rectangle 4 x 5 = "+myShape.getPerimeter());
        System.out.println("Area of rectangle 4 x 5 = "+myShape.getArea());
        myShape = new Square(7);
        System.out.println("Perimeter of square 7 x 7 = "+myShape.getPerimeter());
        System.out.println("Area of square 7 x 7 = "+myShape.getArea());

//        myShape.getLength(); // does work because we instantiated myShape with a type of Measurable, which does not have getLength methods
//        myShape.getWidth(); // does work because we instantiated myShape with a type of Measurable, which does not have getWidth methods
    }
}
