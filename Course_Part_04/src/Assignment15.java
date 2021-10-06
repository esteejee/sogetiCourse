public class Assignment15 {
    public static void main(String[] args) {
        Character[] characters = {'a','b','f','h','m', 'v', 'q','O', 'E' };

        for (char chr : characters) {
            boolean result = isVowel(chr);
            if(result){
                System.out.println ("The char " + chr + " is a vowel" );
            } else {
                System.out.println ("The char " + chr + " is a consonant");
            }
        }

    }
    private static boolean isVowel(char letter) {
        String str = "aeiouAEIOU";
        return (str.indexOf(letter) != -1);
    }
}
