public class Assignment20 {
    public static void main(String[] args) {

        System.out.println ("The multiplication of 11 and 32 is " + multiply (11, 32));
        System.out.println ("The multiplication of 15, 19 and 41 is " + multiply (15, 19, 41));
        System.out.println ("The multiplication of 2 and 0.97 is " + multiply (2, 0.97));
        System.out.println ("The multiplication of 0.2 and 150 is " + multiply (0.2, 150));
        System.out.println ("The multiplication of 11, 32, 8, 1.01 and 15.09 is " + multiply (11, 32, 8, 1.01, 15.09));
        System.out.println ("The multiplication of 14, 24, 18 and 3 is " + multiply (14, 24, 18, 3));

    }

    private static double multiply(int a, int b) {
        return a * b;
    }

    private static double multiply(int a, int b, int c) {
        return a * b * c;
    }

    private static double multiply(int a, double b) {
        return a * b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double multiply(double... numbers) {
        double result = 1.0;
        for (double n : numbers) {
            result *= n;
        }
        return result;
    }

    private static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }


}

