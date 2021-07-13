package Programa;

import Objetos.Cachorro;
import Objetos.Cavalo;

public class testeAnimal {

	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo();
		Cachorro cachorro1 = new Cachorro();
			
		
		cavalo1.nome = "Fast";
		System.out.println("O nome do cavalo é: " + cavalo1.nome);
		
		
		double idadeHumanos;
		idadeHumanos = 5*6.5;
		cavalo1.idade = 5;
		System.out.println("A idade do cavalo " + cavalo1.nome + " é: "+ cavalo1.idade + " anos");
		System.out.println("O que equiale á idade de humanos: " + idadeHumanos + " Anos");
		
		System.out.println(cavalo1.nome + " Relinche");
		cavalo1.emitirSom();
		
		System.out.println(cavalo1.nome + " Agora não relinche");
		cavalo1.quieto();
		
		System.out.println("____________________________________________________________");
		
		cachorro1.nome = "Black";
		cachorro1.raca = "American Bully";
		cachorro1.peso = 37;
		cachorro1.idade = 6;
		
		System.out.println("O nome desse cachorro é: " + cachorro1.nome);
		System.out.println("A raça do " + cachorro1.nome +" é " + cachorro1.raca);
		System.out.println("O seu peso atual está em torno de: " + cachorro1.peso + "Kg");
		System.out.println("Sua idade atual e de: " + cachorro1.idade + " anos");
		int cachorroHumanos;
		cachorroHumanos = 6 * 7;
		System.out.println("Na nossa perspectiva de idade humana, seria: " +cachorroHumanos + " anos!");
		
		System.out.println(cachorro1.nome + " Late!");
		cachorro1.late();
		
		System.out.println(cachorro1.nome + " Pare de latir agora!");
		cachorro1.naoLate();
	}

}
