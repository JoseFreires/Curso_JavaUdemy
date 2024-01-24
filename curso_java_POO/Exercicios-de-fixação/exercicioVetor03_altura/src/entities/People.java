package entities;

public class People {
	private String name;
	private double altura;
	private int idade;
	
	public People() {
	}
	
	public People(String name, double altura, int idade) {
		this.name = name;
		this.altura = altura;
		this.idade = idade;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
