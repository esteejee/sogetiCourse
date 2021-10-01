public class Assignment06 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer ("Hello Java World!");
        stringBuffer.append (", programming in Java is fun.");
        System.out.println (stringBuffer);

        StringBuilder strTekst = new StringBuilder ("Hello Java World!");
        strTekst.delete (6,10);
        System.out.println (strTekst);

        Integer myInt = 10;
        double myDouble = myInt.doubleValue ();
        System.out.println ("De waarde van myDouble is " + myDouble);

        Double myDouble2 = 11.89;
        int myIntValue = myDouble2.intValue ();
        System.out.println ("De waarde van myIntValue is " + myIntValue);

    }
}
