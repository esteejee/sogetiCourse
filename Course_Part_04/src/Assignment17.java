public class Assignment17 {
    public static void main(String[] args) {

        int[] years = {1990, 2008, 2011, 2020, 2021, 2050};

        for (int year : years) {
            boolean result = isLeap (year);
            if (result) {
                System.out.println (year + " is a leap year");
            } else {
                System.out.println (year + " is not a leap year");
            }
        }
    }


    private static boolean isLeap(int year) {

        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
