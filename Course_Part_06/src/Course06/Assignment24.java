package Course06;

public class Assignment24 {
    public static void main(String[] args) {

        Course tmap = new Course ();
        tmap.setName ("Tmap");
        tmap.setNumberOfAssignments (35);
        System.out.println ("The course " + tmap.getName () + " has " + tmap.getNumberOfAssignments () + " assignments");

        String fun = tmap.isFun () ? "fun" : "not fun";
        System.out.println ("The course " + tmap.getName () + " has " + tmap.getNumberOfAssignments () + " assignments and is " + fun);

        Course leanGreenBelt = new Course ();
        leanGreenBelt.setName ("Lean Green Belt");
        leanGreenBelt.setNumberOfAssignments (13);
        fun = leanGreenBelt.isFun () ? "fun" : "not fun";
        System.out.println ("The course " + leanGreenBelt.getName () + " has " + leanGreenBelt.getNumberOfAssignments () + " assignments and is " + fun);
    }
}
