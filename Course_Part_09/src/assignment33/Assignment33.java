package assignment33;

import java.util.Locale;
import java.util.Scanner;

public class Assignment33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        // gebruiken om input en output met decimal point te ondersteunen
        scanner.useLocale (Locale.US);
        Locale.setDefault (new Locale ("GB"));

        System.out.print ("Enter an username: ");
        String userName = scanner.nextLine ();

        System.out.print ("What is your age? ");
        int age = scanner.nextInt ();

        System.out.print ("What is your salary? Use decimal point! ");
        double salary = scanner.nextDouble ();

        System.out.println ("The username is " + userName);
        System.out.println ("Your age is " + age);
        System.out.println ("The salary of the user is: " + salary);
    }
}

