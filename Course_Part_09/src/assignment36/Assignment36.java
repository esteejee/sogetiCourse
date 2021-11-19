package assignment36;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment36 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter ("/Users/sjackjansma/MijnDocumenten/Java/JavaFundamentals/Course_Part_09/src/documents/output.txt");
             BufferedWriter bufferedWriter = new BufferedWriter (fileWriter)) {

            bufferedWriter.write ("Hello");
            bufferedWriter.newLine ();
            bufferedWriter.write ("My name is");
            bufferedWriter.newLine ();
            bufferedWriter.write ("Sjack Jansma!");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
