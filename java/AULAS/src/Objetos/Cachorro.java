package Objetos;

public class Cachorro {

	public String nome;
	public String raca;
	public int idade;
	public boolean som;
	public int peso;
	
	public void late() {
		som = true;
			System.out.println("au au au");	
	}
	public void naoLate() {
		som = false;
			System.out.println("O Black está latino ? " + som);	
	}
	
	
}
