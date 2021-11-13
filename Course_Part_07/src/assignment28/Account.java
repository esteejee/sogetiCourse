package assignment28;

public class Account {   //degault access modifier. Alleen gebruik binnen deze package.
    String name;
    int balance;

    void printOverview() {
        System.out.println (String.format("Overview: name = %s, balance = %d", name, balance));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
