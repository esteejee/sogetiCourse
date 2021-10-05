public class Assingment12 {
    public static void main(String[] args) {
        printGreetingMessageToConsole ();
        String message = getJavaGreeting ();
        System.out.println ("The greetings is " + message);
        printNameToConsole ("John");
        int result = sumOfIntegers (10, 20);
        System.out.println ("The sum of 10 and 20 is " + result);
    }


// a method that prints the message Hello World! to console
    private static void printGreetingMessageToConsole(){
        System.out.println ("Hello World!");
    }
// a method that returns "Hello Java"
    private static String getJavaGreeting(){
        return "Hello Java";
    }
// a method that returns a message with the given name in the parameter.
    private static void printNameToConsole(String name) {
        System.out.println ("Hello " + name + ", welcome to the Java course :)");
    }
// a method that returns the sum of two given parameters
    private static int sumOfIntegers(int a, int b) {
        return  (a+b);
    }
}
