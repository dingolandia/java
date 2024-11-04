package entities;

public class Account {
	private int number;
	private String name;
	private double balance;
	private static final double WITHDRAW_FEE = 5;

	public Account(int accountNumber, String accountName, double accountBalance) {
		this.number = accountNumber;
		this.name = accountName;
		this.balance = accountBalance;
	}

	public double getAccountNumber() {
		return number;
	}

	public String getAccountName() {
		return name;
	}

	public void setAccountName(String accountName) {
		this.name = accountName;
	}

	public double getAccountBalance() {
		return balance;
	}
	
	public void addMoney(double value) {
		balance += value;
	}
	
	public void withdrawal(double value) {
		balance -= (value + WITHDRAW_FEE);
	}
	
	public String getUserData() {
		return "O usuário: [" + this.name + "] da conta: [" + this.number + "] Possui o seguinte Saldo: R$ " + this.balance;
	}

}
