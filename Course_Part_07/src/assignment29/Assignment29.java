package assignment29;

public class Assignment29 {
    public static void main(String[] args) {

        SavingsAccount raboSpaarrekening = new SavingsAccount ();
        raboSpaarrekening.deposit (5000);
        raboSpaarrekening.setName ("Rabo spaarrekening");
        System.out.println (String.format("The yearly interest on your %s is € %d", raboSpaarrekening.getName (), raboSpaarrekening.getAnnualInterest ()));
        raboSpaarrekening.setName ("Rabo spaarrekening");
        raboSpaarrekening.printOverview ();
        raboSpaarrekening.withDraw (3000);
        raboSpaarrekening.printOverview ();

        SavingsAccount abnSpaarrekening = new SavingsAccount ();
        abnSpaarrekening.setName ("ABN spaarrekening");
        abnSpaarrekening.deposit (1000);
        abnSpaarrekening.withDraw (2000);
    }
}
