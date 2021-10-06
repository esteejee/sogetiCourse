public class Assignment19 {
    public static void main(String[] args) {
        double sum = multiplyDoubles (2, 7, 8.4);
        double sum2 = multiplyDoubles (0.1, 9.0, 23.4, 100);
        System.out.println ("The multiplication of 2, 7 en 8.4 is " + sum + ".");
        System.out.println ("The multiplication of 0.1, 9.0, 23.4 en 100 is " + sum2 + ".");
    }

    private static double multiplyDoubles(double... num) {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                sum = num[i];  // save the first number
            } else {
                sum *= num[i];  // multiply the next numbers

            }
        }
        return sum;
    }
}
