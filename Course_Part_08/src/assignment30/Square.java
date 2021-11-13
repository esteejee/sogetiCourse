package assignment30;

public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super (name);
        if (!(isPositive (side))) {
            this.side = 0;
        } else {
            this.side = side;
        }
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
        if (!(isPositive (side))) {
            this.side = 0;
        } else {
            this.side = side;
        }
    }
}
