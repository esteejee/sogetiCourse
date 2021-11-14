package assignment32;

public class Assignment32 {

    public static void main(String[] args) {

        for (Month m : Month.values ()) {
            System.out.printf ("Month number of %s is %s an has %d days.%n", m, m.getMonthNumber (), m.getNumberOfDays ());
        }
    }
}
