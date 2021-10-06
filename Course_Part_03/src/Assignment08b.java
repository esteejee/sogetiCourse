public class Assignment08b {
    public static void main(String[] args) {
        String name = "Bob";
        switch (name) {
            case "John": {
                System.out.println ("His name is John");
                break;
            }
            case "Doe": {
                System.out.println ("His name is Doe");
                break;
            }
            default:
                System.out.println ("His name is neither John nor Doe");
        }
    }
}

