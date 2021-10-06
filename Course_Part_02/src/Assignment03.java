public class Assignment03 {

    public static void main(String[] args) {
        int myInt = 100;
        long myLong1 = myInt; // from int to long
        float myFloat = myLong1; // from long to float

        System.out.println ("De waarde van myInt is: " + myInt);
        System.out.println ("De waarde van myLong is: " + myLong1);
        System.out.println ("De waarde van myFloat is: " + myFloat);

        double myDouble2 = 66.78;
        long myLong2 = (long) myDouble2; // from long to double
        int myInt2 = (int) myLong2; // from long to int

        System.out.println ("De waarde van myDouble2 is: " + myDouble2);
        System.out.println ("De waarde van myLong2 is: " + myLong2);
        System.out.println ("De waarde van myInt2 is: " + myInt2);
    }
}
