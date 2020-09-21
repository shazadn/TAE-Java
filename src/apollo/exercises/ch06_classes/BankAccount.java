package apollo.exercises.ch06_classes;

import java.text.DecimalFormat;

public class BankAccount {
	private String user;
	private double balance;

	public BankAccount(String user, double initialBalance) {
		this.user = user;
		this.balance = initialBalance;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void deposit(double amount) {
		balance+=amount;
	}

	public void withdraw(double amount) {
		if(amount < balance) {
		balance-=amount;
		}
	}

	public void printBalance() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Hello " + user + ", your Balance is: £" + df.format(balance));
	}

}
