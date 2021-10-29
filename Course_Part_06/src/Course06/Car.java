package Course06;

public class Car {
    private String name;
    private int currentSpeed;
    private int topSpeed;

    public void increaseSpeed(int increment) {
        if (increment < 0) {
            System.out.println ("Cannot decrease my speed with this method");
            System.out.println ("Current speed is: " + currentSpeed);
        } else {
            if (currentSpeed + increment > 250) {
                System.out.println ("Topspeed of " + name + " has been reached: " + topSpeed + " km/h");
                System.out.println ("Current speed is: " + topSpeed);
            }
            currentSpeed += increment;
        }
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
