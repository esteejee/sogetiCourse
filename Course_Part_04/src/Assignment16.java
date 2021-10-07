public class Assignment16 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String result = isPrime (i) ? "The number " + i + " is a prime" : "The number " + i + " is not a prime";
            System.out.println (result);
        }
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i <= Math.sqrt (number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
