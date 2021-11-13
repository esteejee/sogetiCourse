package assignment30;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // in de constructor al controle op positieve getallen, alleen bij aanmaken object
    public Rectangle(String name, double width, double height) {
        super ("Rectangle");
        if (!(isPositive (width))) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (!(isPositive (height))) {
            this.height = 0;
        } else {
            this.height = height;
        }
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
        if (!(isPositive (width))) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    // ook in de methode de controle op positieve getallen
    public void setHeight(double height) {
        if (!(isPositive (height))) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}
