package day2;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount (String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + " from " + this.accountNumber);
            System.out.println("Balance is " + this.balance);
        }else  {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdraw Successful");
            System.out.println("Balance is " + this.balance);
        }else  {
            System.out.println("Insufficient Balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }


}
