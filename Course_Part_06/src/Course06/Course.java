package Course06;

public class Course {
    private String name;
    private int numberOfAssignments;
    private boolean fun;

    public String getName() {
        return name;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public boolean isFun() {
        fun = (numberOfAssignments < 30);
        return fun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfAssignments(int numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }
}
