package course06;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println ("The default constructor has been used!");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println ("Parameterized constructor has been used!");
    }

    public void printCoordinates() {
        System.out.println ("The x value is " + getX () + " and the y value is "  + getY ());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
