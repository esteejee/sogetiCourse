public class Review01 {
    public static void main(String[] args) {
        double[] doubleArray = {6.3, 7.8, 5.9};
        double[] doubleArray2 = {5.7, 7.6, 4.0, 9.8};
        String[] operator = {"+", "-", "*", "/", "%" };

        int result = calculation (doubleArray, doubleArray2, operator);

        System.out.println ("" + result);

    }

    private static int calculation(double[] numbersA, double[] numbersB, String[] operators) {

        int count = 0;
        for (double numberA : numbersA) {
            for (double numberB : numbersB) {
                for (String operator : operators) {
                    double result = calculator (numberA, numberB, operator);
                    printResult (numberA, numberB, operator, result);
                    count++;
                }
            }
        }
        return count;
    }


    private static double calculator(double a, double b, String operator) {

        switch (operator) {
            case "+": {
                return a + b;
            }
            case "-": {
                return a - b;
            }
            case "*": {
                return a * b;
            }
            case "/": {
                return a / b;
            }
            default:
                return 0.0;
        }
    }


    private static void printResult(double number1, double number2, String operator, double result) {

        String strResult;

        if (result < 0) {
            strResult = String.format ("The calculation %.2f %s %.2f = %.2f -> result is negative", number1, operator, number2, result);
        } else {
            strResult = String.format ("The calculation %.2f %s %.2f = %.2f -> result is positive", number1, operator, number2, result);
        }
        System.out.println (strResult);
    }
}
