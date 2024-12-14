package entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double reward;
	
	public Employee(String name, Double reward) {
		this.name = name;
		this.reward = reward;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public Double getReward() {
		return reward;
	}

	public void setReward(Double reward) {
		this.reward = reward;
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}
	
	
}
