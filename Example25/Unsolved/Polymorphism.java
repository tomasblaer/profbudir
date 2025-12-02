package Example25.Unsolved;

abstract class Account {
    protected int number;
    protected int balance;

    public Account(int number) {
        this.number = number;
        balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public abstract int available();
}

class Checking extends Account {
    private int overdraft;

    public Checking(int number, int overdraft) {
        super(number);
        this.overdraft = overdraft;
    }

    public int available() {
        return balance + overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }
}

class Savings extends Account {
    private double interest;

    public Savings(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public int available() {
        return balance;
    }

}

class Currency extends Checking {
    private double exchange;

    public Currency(int number, int overdraft, double exchange) {
        super(number, overdraft);
        this.exchange = exchange;
    }

}


public class Polymorphism {
    public static void main(String[] args) {

        Savings reikningur1 = new Savings(123, 6.4);
        Checking reikningur2 = new Checking(124, 120000);
    }
}
