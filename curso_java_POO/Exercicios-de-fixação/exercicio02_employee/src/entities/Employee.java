package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double upgradeSalary (double percentage) {
		return grossSalary = ((grossSalary / percentage) + grossSalary) - tax;
	}
	
	public String toString() {
		return "Employee :" + name +  " R$" + netSalary();
	}
}
