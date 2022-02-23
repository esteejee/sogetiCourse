package assignment28;

public class Account {   //degault access modifier. Alleen gebruik binnen deze package.
    protected String name;
    protected int balance;


    public void printOverview() {
        System.out.println (String.format("Overview: name = %s, balance = %d", name, balance));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
