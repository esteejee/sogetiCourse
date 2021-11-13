package assignment30;


public class Circle extends Shape {
    private double radius;
    final double pi = Math.PI;

    // in de constructor al controle op positieve getallen, alleen bij aanmaken object
    public Circle(String name, double radius) {
        super ("Circle");
        if (!(isPositive (radius))) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    @Override
    public void draw() {
        System.out.println ("Drawing a circle....");
    }

    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * pi * radius;
    }

    public double getRadius() {
        return radius;
    }

    // ook in de methode de controle op positieve getallen
    public void setRadius(double radius) {
        if (!(isPositive (radius))) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
}
