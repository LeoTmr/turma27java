package Objetos;

public class Aviao {

	public int rodas;
	public String modelo;
	public String tipo;
	public boolean noAr;
	public int piloto=0;
	public int velocidade;	
	public boolean ligado;
	
	
	public void ligar() {
		ligado = true;
	}
	
	public void desliga() {
		ligado = false;
	}
	
	
	
	public void decolando () {
		for(int x=0; x<10; x++) {
			aumentarVelocidade();
		}
		noAr=true;
		
	}
	
	
	public void pousou () {
		for(int x=0; x<10; x++) {
			diminuirVelocidade();
		}
		noAr=false;
	}
		public void aumentarVelocidade () {
		velocidade++;
		}
		public void aumentarVelocidade (int acrescimo) {
			velocidade=velocidade + acrescimo;
			}
		
	public void diminuirVelocidade () {
		velocidade--;
		}
	public void diminuirVelocidade (int decrescimo) {
		velocidade -= decrescimo;
		}
}
