
public class DrawingApplication {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    static void displayShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}
