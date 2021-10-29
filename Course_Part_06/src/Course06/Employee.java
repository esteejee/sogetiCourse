package Course06;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;


    public int getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(int percent) {
        salary += ((salary * percent) / 100);
    }

    public void printOverview() {
        System.out.println ("Employee [" + id + ", " + firstName + " " + lastName + ", " + salary + "]" );
    }
}
