package entities;

public class Product {
	
	public String name;
	public double price;
	public int quant;
	
	public double totalValueInStock() {
		return price * quant;
	}
	
	public void addProducts(int quant) {
		this.quant += quant;
	}
	
	public void removeProducts(int quant) {
		this.quant -= quant;
	}

	public String toString() {
		return name 
				+ ", R$ " + String.format("%.2%f", price) 
				+ ", unidades: " + quant 
				+ ". O total é " + String.format("%.2%f", totalValueInStock());
	}
} 