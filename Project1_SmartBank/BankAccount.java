
package Project1_SmartBank;

import java.util.ArrayList;

// Custom Exception Class
class BankException extends Exception {

    public BankException(String message) {
        super(message);
    }
}

// Transaction Class
class Transaction {

    private String type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(String type, double amount,
                       double balance, String description) {

        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public void displayTransaction() {

        System.out.println("Transaction Type : " + type);
        System.out.println("Amount           : Rs. " + amount);
        System.out.println("Balance          : Rs. " + balance);
        System.out.println("Description      : " + description);
        System.out.println("----------------------------------------");
    }
}

// Abstract BankAccount Class
public abstract class BankAccount {

    // Encapsulation
    private String accountNumber;
    private String customerName;
    private String pin;
    private double balance;

    private ArrayList<Transaction> transactions;

    // Constructor
    public BankAccount(String accountNumber, String customerName,
                       String pin, double initialDeposit) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.pin = pin;
        this.balance = initialDeposit;

        transactions = new ArrayList<Transaction>();

        transactions.add(
            new Transaction(
                "DEPOSIT",
                initialDeposit,
                balance,
                "Initial deposit"
            )
        );
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // PIN validation
    public boolean verifyPin(String enteredPin) {
        return pin != null && pin.equals(enteredPin);
    }

    // Set balance
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Method overloading - Version 1
    public void deposit(double amount) throws BankException {
        deposit(amount, "Cash deposit");
    }

    // Method overloading - Version 2
    public void deposit(double amount, String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                "Deposit amount must be greater than zero."
            );
        }

        balance = balance + amount;

        transactions.add(
            new Transaction("DEPOSIT", amount, balance, description)
        );
    }

    // Abstract withdrawal method
    public abstract void withdraw(double amount)
            throws BankException;

    // Common withdrawal operation
    protected void completeWithdrawal(double amount, String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new BankException("Insufficient balance.");
        }

        balance = balance - amount;

        transactions.add(
            new Transaction("WITHDRAW", amount, balance, description)
        );
    }

    // Transfer money into account
    public void addTransferCredit(double amount, String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                "Transfer amount must be greater than zero."
            );
        }

        balance = balance + amount;

        transactions.add(
            new Transaction("TRANSFER IN", amount, balance, description)
        );
    }

    // Transfer money out of account
    public void addTransferDebit(double amount, String description)
            throws BankException {

        if (amount <= 0) {
            throw new BankException(
                "Transfer amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new BankException("Insufficient balance.");
        }

        balance = balance - amount;

        transactions.add(
            new Transaction("TRANSFER OUT", amount, balance, description)
        );
    }

    // Get transaction history
    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<Transaction>(transactions);
    }

    // Abstract account type
    public abstract String getAccountType();

    // Display basic details
    public void displayBasicDetails() {

        System.out.println("----------------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Account Type   : " + getAccountType());
        System.out.println("----------------------------------------");
    }

    // Display account details
    public void displayAccountDetails() {

        displayBasicDetails();

        System.out.printf("Balance        : Rs. %.2f%n", balance);

        System.out.println("----------------------------------------");
    }

    // Display transaction history
    public void displayTransactionHistory() {

        System.out.println("\nTRANSACTION HISTORY");

        for (Transaction t : transactions) {
            t.displayTransaction();
        }
    }
}
