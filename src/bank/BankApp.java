package bank;

import java.util.Scanner;

public class BankApp {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		BankAccount acc1 = new BankAccount(200);
		
		System.out.println("Please select your operation :");
		System.out.println("1: add money to deposit");
		System.out.println("2: withdraw money");
		System.out.println("3: Exit");
		
				switch (input.nextInt()) {
				case 1:
					System.out.println("How much money do you want add? ");
					double addMoney = input.nextDouble();
					acc1.deposit(addMoney);
					acc1.display();
					break;
				case 2:
					System.out.println("How much withdrow? ");
					double withdrawMoney = input.nextDouble();
					acc1.withdraw(withdrawMoney);
					acc1.display();
					break;
				case 3:
					break;
				}
		
	}

}
