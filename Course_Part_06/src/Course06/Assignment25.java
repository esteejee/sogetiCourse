package Course06;

public class Assignment25 {
    public static void main(String[] args) {

        Point defaultPoint = new Point ();
        Point awesomePoint = new Point (4, 5);
        awesomePoint.printCoordinates (4, 5);
        System.out.println ("The x value is " + awesomePoint.getX () + " and the y value is " + awesomePoint.getY ());
    }
}
