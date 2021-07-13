package entities;

public class Terceiro extends Funcionario{	

	private double adicional;

	public Terceiro(String matricula, int horasTrabalhadas, double valorMatricula, double adicional) {
		super(matricula, horasTrabalhadas, valorMatricula);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	@Override
		public double salario () {
		
		
		return (super.getHorasPrivadas() * super.getValorMatricula()) + adicional;
	}

}
