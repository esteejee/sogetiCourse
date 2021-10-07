public class Assignment13 {
    public static void main(String[] args) {

        double resultAddition = calculator (1.0, 3.0, "+");
        if (resultAddition != 0.0) {
            System.out.println ("the addition of 1 and 3 is " + resultAddition);
        } else {
            System.out.println ("unkown operator");
        }

        double resultSubtraction = calculator (1.0, 3.0, "-");
        if (resultSubtraction != 0.0) {
            System.out.println ("the subtraction of 1 and 3 is " + resultSubtraction);
        } else {
            System.out.println ("unkown operator");
        }

        double resultMultiplication = calculator (1.0, 3.0, "*");
        if (resultMultiplication != 0.0) {
            System.out.println ("the multiplication of 1 and 3 is " + resultMultiplication);
        } else {
            System.out.println ("unkown operator");
        }

        double resultDivision = calculator (1.0, 3.0, "/");
        if (resultDivision != 0.0) {
            System.out.println ("the division of 1 and 3 is " + resultDivision);
        } else {
            System.out.println ("unkown operator");
        }

        double resultModulus = calculator (1.0, 3.0, "%");
        if (resultModulus != 0.0) {
            System.out.println ("the modulus of 1 and 3 is " + resultModulus);
        } else {
            System.out.println ("unkown operator");
        }
    }

    private static double calculator(double a, double b, String operator) {


        switch (operator) {
            case "+": {
                return (a + b);
            }
            case "-": {
                return (a - b);
            }
            case "*": {
                return (a * b);
            }
            case "/": {
                return (a / b);
            }
            default:
                return 0.0;
        }
    }
}
