package assignment30;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super ("Square");
        setSide (side);
    }

    @Override
    public void draw() {
        System.out.println ("Drawing a square.....");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = (!(isPositive (side))?0:side);
    }
}
