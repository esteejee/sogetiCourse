package assignment39;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment39 {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<> ();
        colorList.add ("Red");
        colorList.add ("Green");
        colorList.add ("Orange");
        colorList.add ("White");
        colorList.add ("Black");

        System.out.println (colorList);
        System.out.println ("__________________________________");

        colorList.forEach (System.out::println);
        System.out.println ("__________________________________");

        System.out.println ("The size of the array list is " + colorList.size ());
        System.out.println ("__________________________________");

        colorList.add (0, "Pink");
        colorList.add (5, "Yellow");
        System.out.println (colorList);
        System.out.println ("__________________________________");

        String s = colorList.get (0);
        System.out.println ("The color of index 0 is " + s);
        System.out.println ("__________________________________");

        s = colorList.get (3);
        System.out.println ("The color of index 0 is " + s);
        System.out.println ("__________________________________");

        colorList.set (5, "Blue");
        System.out.println (colorList);
        System.out.println ("__________________________________");

        colorList.remove (4);
        System.out.println (colorList);
        System.out.println ("__________________________________");

        //String color = colorList.get (colorList.indexOf ("Green")); //ik vind dit netter dan: System.out.println ("found the color " + colorList.get (colorList.indexOf ("Green")) + "!");
        boolean isColorInList = colorList.contains ("Green");
        if (isColorInList) {
            System.out.println ("found the color Green!");
        } else {
            System.out.println ("Green not found");
        }

        System.out.println ("__________________________________");

        System.out.println ("Colorlist before sort " + colorList);
        Collections.sort (colorList);
        System.out.println ("Colorlist after sort " + colorList);
        System.out.println ("__________________________________");
    }
}

