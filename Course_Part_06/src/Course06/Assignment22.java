package Course06;

public class Assignment22 {
    public static void main(String[] args) {

        Employee pieter = new Employee ();
        pieter.id = 1;
        pieter.firstName = "Pieter";
        pieter.lastName = "Post";
        pieter.salary = 2500;

        System.out.println ("Annual salary is: " + pieter.getAnnualSalary ());
        pieter.raiseSalary (15);
        System.out.println ("Salary Pieter with raise of 15%: " + pieter.salary);
        pieter.printOverview ();

        Employee henry = new Employee ();
        henry.id = 2;
        henry.firstName = "Henry";
        henry.lastName = "Henriksen";
        henry.salary = 1250;

        henry.raiseSalary (23);
        henry.printOverview ();
    }
}
