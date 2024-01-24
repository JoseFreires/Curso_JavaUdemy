package entities;

public class BusinessAcount extends Account{
	
	private Double loanLimit;
	
	public BusinessAcount() {
		super();
	}
	

	public BusinessAcount(Integer number, String houlder, Double balance, Double loadLimit) {
		super(number, houlder, balance);
		this.loanLimit = loadLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount + 10.0;
		}
		
	}
	
}
