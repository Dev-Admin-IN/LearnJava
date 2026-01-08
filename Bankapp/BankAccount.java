public class BankAccount {
    private String accountHolderName;
    private double balance;
    public void setAccountHolderName(String name) {
        accountHolderName = name;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
