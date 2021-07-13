package Objetos;

public class Cavalo {

	
	public String nome;
	public int idade;
	public boolean som;
	public int correr;
	
	
		public void emitirSom () {
			som = true;
			System.out.println("him in in!!");
		}
		
		public void quieto () {
			som = false;
			System.out.println("O cavalo esta relinchando? " + som);
		}
		




}