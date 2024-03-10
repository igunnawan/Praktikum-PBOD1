package Tugas_Tambahan_Praktikum;

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(600.0);
        try {
            acc.withdraw(200.0);
            acc.withdraw(200.0);
            acc.withdraw(500.0);
        }
        catch (InsufficientFundsException message) {
            System.out.println(message.getMessage());
        }  
      }
    
}
