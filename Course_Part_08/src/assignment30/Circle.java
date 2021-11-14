package assignment30;


public class Circle extends Shape {
    private double radius;

    // in de constructor al controle op positieve getallen, alleen bij aanmaken object
    public Circle(double radius) {
        super ("Circle");
        setRadius (radius);
    }

    @Override
    public void draw() {
        System.out.println ("Drawing a circle....");
    }

    @Override
    public double calculateArea() {
        //return pi * radius * radius;
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    // ook in de methode de controle op positieve getallen
    public void setRadius(double radius) {
        this.radius = (isPositive (radius) ? radius : 0);
    }
}
