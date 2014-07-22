package gui.bank.account;

public class BankAccount {
	private double balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	// deposit money into the bank
	
	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	// withdraws money from the bank account.
	
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
	
	// gets the current balance of the bank account
	
	public double getBalance() {
		return balance;
	}
}
