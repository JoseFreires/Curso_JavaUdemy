package entities;

public class PessoaJuridica extends Contribuintes{
	private Integer qntFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double gastoAnual, Integer qntFuncionarios) {
		super(nome, gastoAnual);
		this.qntFuncionarios = qntFuncionarios;
	}

	public Integer getQntFuncionarios() {
		return qntFuncionarios;
	}

	public void setQntFuncionarios(Integer qntFuncionarios) {
		this.qntFuncionarios = qntFuncionarios;
	}

	@Override
	public double calculoImposto() {
		if(qntFuncionarios > 10) {
			return super.getGastoAnual() * 0.14;
		} else {
			return super.getGastoAnual() * 0.16;
		}
	}
	
	

}
