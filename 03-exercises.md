**Question 1**

```java
abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public abstract boolean withdraw(double amount);
}

interface InterestBearing {
    void addInterest();
}

class ChequingAccount extends Account {
    private double overdraftLimit;

    public ChequingAccount(double balance, double overdraftLimit) {
        super(balance);

        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if (this.balance + overdraftLimit < amount) {
            return false;
        }

        this.balance -= amount;

        return true;
    }
}

class SavingsAccount extends Account implements InterestBearing {
    private double rate;

    public SavingsAccount(double balance, double rate) {
        super(balance);

        this.rate = rate;
    }

    public boolean withdraw(double amount) {
        if (this.balance < amount) {
            return false;
        }

        this.balance -= amount;

        return true;
    }

    public void addInterest() {
        this.balance *= (1.0 + rate);
    }
}
```
