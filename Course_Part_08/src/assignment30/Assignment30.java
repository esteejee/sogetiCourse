package assignment30;

public class Assignment30 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle (20.5, 30.1);
        rectangle.draw ();
        printShapeInfo (rectangle.getName (), rectangle.calculateArea (), rectangle.calculatePerimeter ());

        Circle circle = new Circle(52.12);
        circle.draw ();
        printShapeInfo (circle.getName (), circle.calculateArea (), circle.calculatePerimeter ());

        Square square = new Square (20.00);
        square.draw ();
        printShapeInfo (square.getName (), square.calculateArea (), square.calculatePerimeter ());

        System.out.println ("--------------------------------------------");
        rectangle.setHeight (10.5);
        rectangle.setHeight (60.3);
        printShapeInfo (rectangle.getName (), rectangle.calculateArea (), rectangle.calculatePerimeter ());

        circle.setRadius (13.7);
        printShapeInfo (circle.getName (), circle.calculateArea (), circle.calculatePerimeter ());

        square.setSide (36.2);
        printShapeInfo (square.getName (), square.calculateArea (), square.calculatePerimeter ());

        System.out.println ("--------------------------------------------");

        rectangle.setWidth (-20.00);
        rectangle.setHeight (-8.00);
        printShapeInfo (rectangle.getName (), rectangle.calculateArea (), rectangle.calculatePerimeter ());

        circle.setRadius (-25.9);
        printShapeInfo (circle.getName (), circle.calculateArea (), circle.calculatePerimeter ());

        square.setSide (-98.9);
        printShapeInfo (square.getName (), square.calculateArea (), square.calculatePerimeter ());
    }

    private static void printShapeInfo(String shapeName, double area, double perimeter) {
        //System.out.println (String.format ("The shapename: %s; area: %.2f; perimeter: %.2f", shapeName, area, perimeter));

        //   Ala ik prinf gebruik (ondrstaande regel) dan krijg ik een extra spatie voor de volgende regels. Waarom?
          System.out.printf ("The shapename: %s; area: %.2f; perimeter: %.3f. %n", shapeName, area, perimeter);
    }
}
