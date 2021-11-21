package assignment35;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class assignment35 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader ("Course_Part_09/src/documents/dummy.txt");
             BufferedReader bufferedReader = new BufferedReader (reader)) {

            String line;

            while ((line = bufferedReader.readLine ()) != null) {
                System.out.println (line);
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}

