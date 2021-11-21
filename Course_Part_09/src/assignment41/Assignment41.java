package assignment41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment41 {
    public static final Path path = Paths.get ("Course_Part_09/src/documents/dummy2.txt");

    public static void main(String[] args) {
        int wordCount = 0;
        int uppercaseCount = 0;

        Path fileName = path.getFileName ();

        try (FileReader reader = new FileReader (String.valueOf (path));
             BufferedReader bufferedReader = new BufferedReader (reader)) {
            String line;

            while ((line = bufferedReader.readLine ()) != null) {
                if (!line.trim ().equals ("")) {
                    String[] words = line.split ("\\s");
                    wordCount = wordCount + words.length;

                    for (String word : words) {
                        uppercaseCount += Character.isUpperCase (word.charAt (0)) ? 1 : 0;
                    }
                }
//                wordCount += countWords (line);
//                uppercaseCount += countWordsWithUppercase (line);
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }
        System.out.printf ("The file %s contains %d words,of which %d words start with an uppercase character..", fileName, wordCount, uppercaseCount);
    }

//    public static int countWords(String line) {
//
//        String[] words = line.split ("\\s+"); // \\s is space delimiter
//        return words.length;
//    }
//
//    private static int countWordsWithUppercase(String line) {
//        int uppercaseCount = 0;
//        String[] words = line.split ("\\s+"); // \\s is space delimiter
//        for (String word : words) {
//            if (isWordWithUppercase (word)) {
//                uppercaseCount++;
//            }
//        }
//        return uppercaseCount;
//    }
//
//    private static boolean isWordWithUppercase(String word) {
//        return Character.isUpperCase (word.charAt (0));
//    }
}



