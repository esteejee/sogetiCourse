import java.util.Locale;

public class Assignment04 {

    public static void main(String[] args) {
        String myString = "Dit is een opdracht voor de cursus Java Fundamentals";

        System.out.println ("Lengte van de string " + myString.length ()) ;
        System.out.println ("Het karakter op index 10 is " + myString.charAt (20));
        System.out.println (myString + ". Het is best een leuke cursus");
        System.out.println ("In mijn string kom de letter l voor? " + myString.contains ("l"));
        System.out.println ("Myn string start met de letter D? " + myString.startsWith ("D"));
        System.out.println ("Mijn string eindigt met de letter s?  " + myString.endsWith ("s"));
        System.out.println ("Mijn string eindigt met de letter z? " + myString.endsWith ("z"));
        String compareString = "Opdracht voltooid";
        boolean compare2Strings = myString.equals (compareString);
        System.out.println ("Is de string \"" + myString + "\" gelijk aan string \"" + compareString +"\" ? " + compare2Strings);
        System.out.println ("De index van \"opdracht\" is " + myString.indexOf ("opdracht"));
        System.out.println ("Is de string " + myString + " leeg? " + myString.isEmpty ());
        System.out.println (myString.replace ('o','a'));
        System.out.println ("Het deel uit de string vanaf positie 5, lengte 10 is: " + myString.substring (5,10));
        System.out.println (myString.toLowerCase());
        System.out.println (myString.toUpperCase ());
        String myString2 = "   Dit is een opdracht voor de cursus Java Fundamentals  ";
        System.out.println ("String met spaties aan het begin en einde: "  + myString2);
        System.out.println ("dezelfde string zonder de spaties " +  myString2.trim ());
    }

}
