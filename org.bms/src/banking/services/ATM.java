package banking.services;

public class ATM {
    private double balance;  
    
    public ATM() {
        balance = 0.0;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited ₹%.2f\n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive number.");
        }
    }

   
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdraw ₹%.2f\n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for this withdrawal.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive number.");
        }
    }
    public void checkBalance() {
        System.out.printf("Your current balance is: ₹%.2f\n", balance);
    }
}