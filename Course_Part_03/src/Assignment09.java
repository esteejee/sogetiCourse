public class Assignment09 {
    public static void main(String[] args) {
        //while
        int[] numbers = {5, 8, 4, 6, 9, 7};
        int counter = 0;
        int sum = 0;
        while (counter < numbers.length) {
            sum += numbers[counter];
            counter++;
        }
        System.out.println ("Sum of all members by while loop is " + sum);

        // do while
        sum = 0;
        counter = 0;
        do {
            sum += numbers[counter];
            counter++;
        } while (counter < numbers.length);
        System.out.println ("Sum of all members by do-while loop is " + sum);

        // for loop
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println ("Sum of all numbers by for loop " + sum);

        //for each
        sum = 0;
        counter = 0;
        for (int number : numbers) {
            sum += numbers[counter];
            counter++;
        }
        System.out.println ("Sum of all numbers by for-each loop " + sum);
    }
}
