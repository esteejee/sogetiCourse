package Course06;

public class Assignment23 {
    public static void main(String[] args) {

        Car bmw = new Car ();

        bmw.setName ("BMW");
        bmw.setTopSpeed (250);
        System.out.println ("This " + bmw.getName () + " has a current speed of " + bmw.getCurrentSpeed () + " and has a top speed of " + bmw.getTopSpeed () + " km/h");

        bmw.increaseSpeed (50);
        System.out.println ("Current speed is " + bmw.getCurrentSpeed ());

        Car ferrari = new Car ();
        ferrari.setName ("Ferrari");
        ferrari.setTopSpeed (300);
        ferrari.increaseSpeed (325);

        bmw.increaseSpeed (-10);
    }
}
