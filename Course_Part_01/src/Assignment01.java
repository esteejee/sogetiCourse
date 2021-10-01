public class Assignment01 {

    public static void main(String[] args) {

        final String MY_FULL_NAME = "Sjack Jansma";
        String myString = "Dit is een string";
        String myNewString = myString +  " Dit was een string " + MY_FULL_NAME;
        int Lengte = myNewString.length ();
        System.out.println (Lengte);
        System.out.println ("Het karakter op index 10 is " + myNewString.charAt (20));
        String strExample = String.format("My naam is %s en mijn leeftijd %02d","Sjack", 62);
        System.out.println (strExample);
        String myStringToInteger = "123456";
        int myIntFromString = Integer.parseInt (myStringToInteger);
        String strExample1 = String.valueOf (myIntFromString);
        System.out.println (strExample1);

        System.out.println (myNewString);
        /*
        * int
        * min -2,147,483,648
        * max 2,147,483,648
        * default 0
         */
        int age=62;

        /*
         * boolean
         * true or false
         * default false
         */
        boolean isBirthdayToday = false;

        /*
         * byte
         * min -128
         * max 127
         * default 0
         */
        byte byteVariable = 100;

        /*
         * short
         * min -32,768
         * max 32,768
         * default 0
         */
        short shortVariable = 123;

        /*
         * long
         * min -2^63
         * max 2^63-1
         * default 0
         */
        long longVariable = 2413132123L;

        /*
         * float
         * min 32-bit IEEE
         * max 754 floating-point
         * default 0.0
         */
        float floatVariable = 1234.1234f;

        /*
         * double
         * min 64-bit IEEE
         * max 754 floating point
         * default 0.0
         */
        double doubleVariable = 120.303;

        /*
         * char
         * min '\u0000',' \uffff'
         * max 0,65535
         * default ' u0000'
         */
        char charVariable = 'a';

        System.out.println ("Int value is " + age);
        System.out.println ("Boolean value is " + isBirthdayToday);
        System.out.println ("Byte value is " + byteVariable);
        System.out.println ("Short value is " + shortVariable);
        System.out.println ("Long value is " + longVariable);
        System.out.println ("Float value is " + floatVariable);
        System.out.println ("Double value is " + doubleVariable);
        System.out.println ("Char value is " + charVariable);

    }


}
