package entities;

public class Bank {
	private String name;
	private double saldo;
	private int accountNumber;
	
	// Construtores
	public Bank() {
	}
	
	public Bank(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	public Bank(String name, double deposit, int accountNumber) {
		this.name = name;
		addDeposit(deposit);
		this.accountNumber = accountNumber;
	}

	// Métodos
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	public void addDeposit(double saldo) {
		this.saldo += saldo;
	}
	
	public void removeDeposit(double saldo) {
		this.saldo -= (saldo + 5);
	}
	
	public String toString() {
		return "N° conta: " + accountNumber 
				+ ", nome do titular: " + name 
				+ ". Seu saldo atual: R$" + String.format("%.2f%n", saldo);
	}

	
	
}
