package Tugas_Tambahan_Praktikum;

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        balance = balance - amount;
        if (balance <= MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $" + MIN_BALANCE);
        }
        else {
            System.out.println("Saldo anda tersisa : $" + balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
