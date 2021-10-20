public class Assignment19 {
    public static void main(String[] args) {
        double sum = multiplyDouble (2, 7, 8.4);
        System.out.println ("The multiplication of 2, 7 en 8.4 is " + sum + ".");

        sum = multiplyDouble (0.1, 9.0, 23.4, 100);
        System.out.println ("The multiplication of 0.1, 9.0, 23.4 en 100 is " + sum + ".");

    }

    private static double multiplyDouble(double... numbers) {
        double sum = 1;

        for (double number : numbers) {
            sum *= number;  // multiply the numbers
        }
        return sum;
    }
}
