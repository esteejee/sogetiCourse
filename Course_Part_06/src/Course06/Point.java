package Course06;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println ("The default constructor has been used!");
    }

    public Point(int x, int y) {
        System.out.println ("Parameterized constructor has been used!");
    }

    public void printCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
