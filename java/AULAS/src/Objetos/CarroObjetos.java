package Objetos;


public class CarroObjetos {
	 		
		public int rodas;
		public double motor;
		public int volante;
		public int retrovisor;
		public boolean ligado;
		public int velocidade;
		
		
		public void ligarCarro() {
			ligado = true;
			System.out.println("Carro Ligando!...");
		}
		public void desligarCarro() {
			if(velocidade==0) {
				ligado=false;
				System.out.println("Desligando Carro!...");
			}else {
				System.out.println("Desacelere o carro!..Freie");
			}
			
		}
		public void acelerar() {
			velocidade++;
		}
		
	}

