package bank;

public class BankAccount {
	
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount; 
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void display() {
		System.out.println("Your balance = " + balance);
	}
	
	
}
