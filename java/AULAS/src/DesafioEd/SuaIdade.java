package DesafioEd;

import java.util.Scanner;

public class SuaIdade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int ano, maisVelho=0, maisNovo=0, aux=0;
			char genero;
			String nome;
			
			
			for(int i=0; i<=3; i++) {
				System.out.println("Você pode me informar o seu nome: ");
				nome = leia.nextLine();
				
			System.out.println("Qual é o seu genero? ");	
			System.out.println("Masculino (M), Feminino(F) - Neutro");
				genero = leia.nextLine().toUpperCase().charAt(0);
			System.out.println("Insisra o seu ano de nascimento: ");
				ano=leia.nextInt();
				
			
			
			if((2021-ano) > maisVelho) {
				maisVelho = (2021-ano);
				aux = maisVelho;
			}
			else if ((2021-ano)< aux) {
				maisNovo = (2021-ano);
			}
			else {
				System.out.println(" ");
			}
			
			System.out.println("Ola,  sr/sra/sre ("+nome+"), bom dia! sua idade é: " + (2021 - ano)+ " anos");
			nome = leia.nextLine();
			}
		System.out.println("A maior idade é "+maisVelho);
		System.out.println("A menor idade é "+maisNovo);
	}
}
