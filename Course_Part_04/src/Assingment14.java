public class Assingment14 {
    public static void main(String[] args) {
        int[] numbers = {12, 122, 2343, 24, 55, 96, 77, 87, 900, -1};
        for (int number : numbers) {
            boolean result = isEven (number);
            if (result) {
                System.out.println ("The number " + number + " is even");
            } else {
                System.out.println ("The number " + number + " is odd");
            }
        }
    }

        private static boolean isEven(int number){
            return (number%2==0);
        }
    }

