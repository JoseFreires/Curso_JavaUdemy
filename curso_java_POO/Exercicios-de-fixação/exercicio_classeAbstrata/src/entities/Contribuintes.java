package entities;

public abstract class Contribuintes {
	private String nome;
	private Double gastoAnual;

	public Contribuintes() {
	}

	public Contribuintes(String nome, Double gastoAnual) {
		this.nome = nome;
		this.gastoAnual = gastoAnual;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getGastoAnual() {
		return gastoAnual;
	}

	public void setGastoAnual(Double gastoAnual) {
		this.gastoAnual = gastoAnual;
	}
	
	public abstract double calculoImposto();

}
