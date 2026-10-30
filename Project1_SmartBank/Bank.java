
package Project1_SmartBank;

import java.util.ArrayList;

class BankException extends Exception {

    public BankException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountNumber;
    private String name;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String name,
                       String pin, double balance) {

        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public void deposit(double amount) throws BankException {

        if (amount <= 0) {
            throw new BankException("Invalid deposit amount");
        }

        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    public void withdraw(double amount) throws BankException {

        if (amount <= 0) {
            throw new BankException("Invalid withdrawal amount");
        }

        if (amount > balance) {
            throw new BankException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully!");
    }

    public void displayAccountDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}

public class Bank {

    private ArrayList<BankAccount> accounts;

    private int accountCounter = 1001;

    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    // Generate unique account number
    private String generateAccountNumber() {

        String accountNumber =
                String.format("SB%04d", accountCounter);

        accountCounter++;

        return accountNumber;
    }

    // Validate customer details
    private void validateCustomerDetails(String name, String pin)
            throws BankException {

        if (name == null || name.trim().isEmpty()) {
            throw new BankException("Name cannot be empty");
        }

        if (pin == null || !pin.matches("\\d{4}")) {
            throw new BankException("PIN must contain 4 digits");
        }
    }

    // Create Savings Account
    public BankAccount createSavingsAccount(
            String name, String pin, double initialDeposit)
            throws BankException {

        validateCustomerDetails(name, pin);

        if (initialDeposit < 500) {
            throw new BankException(
                    "Minimum initial deposit is Rs.500");
        }

        String accountNumber = generateAccountNumber();

        BankAccount account = new BankAccount(
                accountNumber, name, pin, initialDeposit);

        accounts.add(account);

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accountNumber);

        return account;
    }

    // Find account
    public BankAccount findAccount(String accountNumber)
            throws BankException {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        throw new BankException("Account not found");
    }

    // Deposit money
    public void depositMoney(String accountNumber, String pin,
                             double amount) throws BankException {

        BankAccount account = findAccount(accountNumber);

        if (!account.checkPin(pin)) {
            throw new BankException("Incorrect PIN");
        }

        account.deposit(amount);
    }

    // Withdraw money
    public void withdrawMoney(String accountNumber, String pin,
                              double amount) throws BankException {

        BankAccount account = findAccount(accountNumber);

        if (!account.checkPin(pin)) {
            throw new BankException("Incorrect PIN");
        }

        account.withdraw(amount);
    }

    // Display account details
    public void displayAccount(String accountNumber, String pin)
            throws BankException {

        BankAccount account = findAccount(accountNumber);

        if (!account.checkPin(pin)) {
            throw new BankException("Incorrect PIN");
        }

        account.displayAccountDetails();
    }

    // Main method
    public static void main(String[] args) {

        Bank bank = new Bank();

        try {

            BankAccount account =
                    bank.createSavingsAccount(
                            "Vasundhra", "1234", 5000);

            String number = account.getAccountNumber();

            System.out.println("\n--- Deposit ---");
            bank.depositMoney(number, "1234", 2000);

            System.out.println("\n--- Withdraw ---");
            bank.withdrawMoney(number, "1234", 1000);

            System.out.println("\n--- Account Details ---");
            bank.displayAccount(number, "1234");

        } catch (BankException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
