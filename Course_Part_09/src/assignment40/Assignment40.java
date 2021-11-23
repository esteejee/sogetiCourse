package assignment40;

import java.util.HashMap;
import java.util.Map;

public class Assignment40 {
    public static void main(String[] args) {
        HashMap<Integer, String> colorMap = new HashMap ();
        colorMap.put (1, "Red");
        colorMap.put (2, "Green");
        colorMap.put (3, "Orange");
        colorMap.put (4, "White");
        colorMap.put (5, "Black");
        System.out.println (colorMap);
        System.out.println ("__________________________________");

        colorMap.forEach (
                (Integer key, String value) -> System.out.println (key + " -> " + value)
        );
        System.out.println ("__________________________________");

        for (Map.Entry entry : colorMap.entrySet ()) {
            System.out.println (entry.getKey () + " -> " + entry.getValue ());
        }
        System.out.println ("__________________________________");

        for (Integer key : colorMap.keySet ()) {
            System.out.println (key + " -> " + colorMap.get (key));
        }
        System.out.println ("__________________________________");

        System.out.println ("The size of hash map is " + colorMap.size ());
        System.out.println ("__________________________________");

        boolean isColorKeyInMap = colorMap.containsKey (6);
        System.out.println ("Does the color map contains the key 6? " + isColorKeyInMap);
        System.out.println ("__________________________________");

        boolean isColorValueInMap = colorMap.containsValue ("Red");
        System.out.println ("Does the color map contains the value Red? " + isColorValueInMap);
        System.out.println ("__________________________________");


        System.out.println ("The color of key 3 is : " + colorMap.get (3));
        System.out.println ("The color of key 3 is : " + colorMap.get (2));
        System.out.println ("The colormap contains these keys " + colorMap.keySet ());
        System.out.println ("The colormap contains these keys " + colorMap.values ());

        colorMap.clear ();
        System.out.println (colorMap);
        boolean isColorMapEmpty = colorMap.isEmpty ();
        System.out.println ("Is the color map empty? " + isColorMapEmpty);
    }
}
