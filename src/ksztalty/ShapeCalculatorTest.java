package ksztalty;

public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Rectangle prostokat1 = new Rectangle(3,10);
        Circle kolo1 = new Circle(4);
        Square kwadrat1 = new Square(5);
        Triangle trojkat1 = new Triangle(1,2,4);
        ShapeCalculator kalkulator = new ShapeCalculator();

        System.out.println( "Pole kola " + kalkulator.circleArea(kolo1));
        System.out.println( "Pole kwadratu " + kalkulator.squareArea(kwadrat1));
        System.out.println( "Obwód trójkąta " + kalkulator.trianglePerimeter(trojkat1));
        System.out.println( "Obwód prostokąta " + kalkulator.rectPerimeter(prostokat1));
    }
}
