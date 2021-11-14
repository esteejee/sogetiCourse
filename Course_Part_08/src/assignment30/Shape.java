package assignment30;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void draw();

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public boolean isPositive(double checkValue) {
        return checkValue >= 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
