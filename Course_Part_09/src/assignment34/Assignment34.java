package assignment34;

public class Assignment34 {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 0;
        int result = divide (number1, number2);
        if (result == 0) {
            System.out.println ("Divide by zero is not possible");
        } else {
            System.out.println ("the result of (" + number1 + "/" + number2 + ") is " + result);
        }

        System.out.println ("***********************");

        number1 = 18;
        number2 = 9;
        result = divide (number1, number2);
        if (result == 0) {
            System.out.println ("Divide by zero is not possible");
        } else {
            System.out.println ("the result of (" + number1 + "/" + number2 + ") is " + result);
        }
    }

    private static int divide(int number1, int number2) {
        int result = 0;
        try {
            result = (number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println ("Divided by zero operation is not possible");
        } finally {
            System.out.println ("Inside the finally block");
        }
        return result;
    }
}

