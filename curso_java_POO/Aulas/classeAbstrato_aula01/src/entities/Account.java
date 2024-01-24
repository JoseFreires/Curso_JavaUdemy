package entities;

public abstract class Account {
	
	private Integer number;
	private String houlder;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String houlder, Double balance) {
		this.number = number;
		this.houlder = houlder;
		this.balance = balance;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHoulder() {
		return houlder;
	}
	public void setHoulder(String houlder) {
		this.houlder = houlder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void withDraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
}
