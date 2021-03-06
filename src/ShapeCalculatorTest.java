public class ShapeCalculatorTest {
    public static void main(String[] args) {

        ShapeCalculator sc = new ShapeCalculator();

        Square square1 = new Square(3.5);
        System.out.printf("Pole kwadratu: %.2f", sc.squareArea(square1));

        Rectangle rectangle1 = new Rectangle(3.0 , 2.5);
        System.out.printf("\nObwód prostokąta: %.2f", sc.rectPerimeter(rectangle1));

        Circle circle1 = new Circle(4.2);
        System.out.printf("\nPole koła: %.2f", sc.circleArea(circle1));

        Triangle triangle1 = new Triangle(3.0 , 1.5 , 2.2);
        System.out.printf("\nObwód trójkąta: %.2f", sc.trianglePerimeter(triangle1));

        System.out.printf("\nPole kwadratu: %.2f" , square1.calculateArea(3.0));
        System.out.printf("\nPole prostokąta: %.2f" , rectangle1.calculateArea(4.2, 6.2));
        System.out.printf("\nPole trójkąta: %.2f" , triangle1.calculateArea(2.2, 3.6));
        System.out.printf("\nObwód koła: %.2f" , circle1.calculateArea(2.0));

    }
}
