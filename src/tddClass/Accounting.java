package tddClass;

public class Accounting {
    private double balance;
    public void deposit(double amount) {if (amount > 0){balance = balance + amount;} }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {if
    (amount < balance && amount > 0)
    {balance = balance - amount;}
    }

    public void effectMonthlyCharges() {balance = balance - (0.01*balance);
    }
}

