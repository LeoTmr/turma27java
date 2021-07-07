package Programa;

import Objetos.Aviao;

public class AviaoPrograma {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();

		aviao1.modelo = "BIMOTOR";
		aviao1.rodas = 3;
		aviao1.tipo = "PASSAGEIRO 14 LUGARES";
		aviao1.noAr = false;
		aviao1.ligado = false;
		aviao1.velocidade = 0;
		
		//colocar para voar..
		
		aviao1.ligar();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.aumentarVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.diminuirVelocidade();
		aviao1.decolando();
		aviao1.aumentarVelocidade(40);
		System.out.println("Velocidade atual: " + aviao1.velocidade + " NO AR!" +aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.diminuirVelocidade(40);
		System.out.println("Velocidade atual: " + aviao1.velocidade + " NO AR!" +aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.pousou();
		System.out.println("Velocidade atual: " + aviao1.velocidade + " NO AR!" +aviao1.noAr + " LIGADO " + aviao1.ligado);
		aviao1.desliga();
		System.out.println("Velocidade atual: " + aviao1.velocidade + " NO AR!" +aviao1.noAr + " LIGADO " + aviao1.ligado);
		
		
		
	}

}
