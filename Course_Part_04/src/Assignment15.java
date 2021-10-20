public class Assignment15 {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'f', 'h', 'm', 'u', 'v', 'q', 'O', 'E'};

        for (char chr : characters) {
            String result = isVowel (chr) ? "The char " + chr + " is a vowel" : "The char " + chr + " is a consonant";
            System.out.println (result);
        }

    }

    private static boolean isVowel(char letter) {
        String str = "aeiouAEIOU";
        return (str.indexOf (letter) != -1);
    }
}
