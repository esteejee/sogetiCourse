package assignment37;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment37 {
    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<> ();
        carList.add ("BMW");
        carList.add ("Mercedes");
        carList.add ("Opel");
        carList.add ("Volvo");
        carList.add ("Fiat");

        System.out.println (carList);

        for (String car : carList) {
            System.out.println (car);
        }

        carList.forEach (car -> System.out.println (car));

        ArrayList<Integer> numberList = new ArrayList<> ();
        Collections.addAll (numberList, 5, 42, 63, 71, 12, -31, 4);
        System.out.println (numberList);
        System.out.println (Collections.min (numberList));
        System.out.println (Collections.max (numberList));
        Collections.sort (numberList);
        System.out.println (numberList);
    }
}
