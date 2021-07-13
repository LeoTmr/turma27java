package entities;

public class Funcionario {

	private String matricula;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {

		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasPrivadas() {
		return horasTrabalhadas;
	}

	public void setHorasPrivadas(int horasPrivadas) {
		this.horasTrabalhadas = horasPrivadas;
	}

	public double getValorMatricula() {
		return valorHora;
	}

	public void setValorMatricula(double valorMatricula) {
		this.valorHora = valorMatricula;
	}
	
	public double salario () {
		
		
		return (this.horasTrabalhadas * this.valorHora);
	}
	
	
	
	
}
