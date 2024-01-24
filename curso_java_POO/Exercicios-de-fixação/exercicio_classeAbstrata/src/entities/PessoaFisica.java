package entities;

public class PessoaFisica extends Contribuintes{
	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double gastoAnual, Double gastoSaude) {
		super(nome, gastoAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculoImposto() {
		if(super.getGastoAnual() < 20000) {
			if(gastoSaude > 0) {
				return (super.getGastoAnual() * 0.15) - (gastoSaude * 0.50);
			} else {
				return super.getGastoAnual() * 0.15;
			}
		} else if (super.getGastoAnual() > 20000) {
			if(gastoSaude > 0) {
				return (super.getGastoAnual() * 0.25) - (gastoSaude * 0.50);
			} else {
				return super.getGastoAnual() * 0.25;
			}
		} else {
			return 0.0;
		}
	}
	
	

}
