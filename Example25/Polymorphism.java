package Example25;
abstract class Account {
    protected final int number;
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
    protected int overdraft;

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
    protected double interest;

    public Savings(int number, double interest) {
        super(number);
        this.interest = interest;
    }

    public int available() {
        return balance;
    }

}

class Currency extends Checking {
    protected double exchange;

    public Currency(double exchange, int number, int overdraft) {
        super(number, overdraft);
        this.exchange = exchange;
    }
}

public class Polymorphism {
    public static void main(String[] args) {

    }
}
