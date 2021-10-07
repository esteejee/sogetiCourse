public class Assignment16 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean result = isPrime (i);
            if (result) {
                System.out.println ("The number " + i + " is a prime");
            } else {
                System.out.println ("The number " + i + " is not a prime");
            }
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
