import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment18 {
    public static void main(String[] args) {
        double[] num = {10.5, 56.6,78.0,2.5};
        double sumOfNumbers = averageOfNumbers (num);
        System.out.println ("The average of all numbers in the array is " + sumOfNumbers);
    }

    private static double averageOfNumbers (double[] listOfNumbers) {
        double total = 0;
        double avg = 0;

        for(int i = 0; i < listOfNumbers.length ; i++) {
            total = total + listOfNumbers[i];
            avg = total / listOfNumbers.length;
            }
        return avg;
    }
}
