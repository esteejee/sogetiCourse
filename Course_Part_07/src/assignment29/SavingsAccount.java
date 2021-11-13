package assignment29;

public class SavingsAccount extends Account {
    int interest;  // gekozen voor default access modifier (ook methodes), alleen beschikbaar voor deze package. De subclass is nu niet te gebruiken vanuit een andere package.

    public SavingsAccount() {
        this.name = name;
        this.balance = 0;
        this.interest = 5;
    }


    @Override
    void withDraw(int amount) {
        if (balance - amount < 0) {
            System.out.println (String.format ("Your balance is negative, it's not possible to withdraw € %d", amount));  // kan ik hier ook printf gebruiken?
            System.out.println (String.format ("Your current balance of your %s is € %d ",name,balance));
        } else {
            balance -= amount;
        }
    }

    int getAnnualInterest() {
        return interest = (balance * interest) / 100;
    }

}
