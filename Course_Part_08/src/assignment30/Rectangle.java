package assignment30;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // in de constructor al controle op positieve getallen, alleen bij aanmaken object
    public Rectangle(double width, double height) {
        super ("Rectangle");
        setWidth (width);
        setHeight (height);
    }

    @Override
    public void draw() {
        System.out.println ("Drawing a rectangle");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    // ook in de methode de controle op positieve getallen
    public void setWidth(double width) {
        this.width = (!(isPositive (width)) ? 0 : width);
    }

    public double getHeight() {
        return height;
    }

    // ook in de methode de controle op positieve getallen
    public void setHeight(double height) {
        this.height = (isPositive (height) ? height : 0);
    }
}
