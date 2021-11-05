package assignment29;

public class Account {
    String name;
    int balance;

    void printOverview() {
        System.out.println (String.format("Overview: name = %s, balance = € %d", name, balance));
    }

    void withDraw(int amount) {
        balance -= amount;
    }

    void deposit(int amount) {
        balance += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
