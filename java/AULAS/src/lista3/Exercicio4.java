package lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade=0, pessoasCalmas =0,mulheresNervosas=0;
		int homensAgressivos=0, outrosCalmos=0, pessoasNervosasMais40anos=0, pessoasCalmasMenos18anos=0;
		char sexo=0;
		char opcao;
		char op='s';
		final int LIMITE = 150;
		int contador=1;
		
		while ((op =='S' || op == 's')&& contador <=LIMITE) {
			System.out.println("Participante " + contador);
			System.out.print("Digite a idade: ");
			idade= leia.nextInt();
			System.out.println("Digite ");
			System.out.print("\n1-Feminino\n2-Masculino\n3-outros " );		
			opcao = leia.next().charAt(0);	
			System.out.println("Selecione ");		
			System.out.println("1° pessoa calma\n2 - pessoa nervosa\n 3- pessoa agressiva: ");
			opcao = leia.next().charAt(0);
			
			if (opcao == '1') {
				pessoasCalmas++;
			}
			if(sexo=='1' && opcao == '2') {
				mulheresNervosas++;
			}
			if (sexo =='2' && opcao =='3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			if (idade <=18 && opcao == '1') {
				pessoasCalmasMenos18anos++;
			}
			if (idade >=40 && opcao == '2') {
				pessoasNervosasMais40anos++;
			}
			
			
			
			
			System.out.println("Continuar S/N: ");
			op=leia.next().charAt(0);
			contador++;
		}
		
		System.out.println("Pessoas Calmas: "+ pessoasCalmas);
		System.out.println("Mulheres Nervosas: "+ mulheresNervosas);
		System.out.println("Homens Agressivos"+ homensAgressivos);
		System.out.println("Outros Calmos"+ outrosCalmos);
		System.out.println("Menores 18 calmos: " + pessoasCalmasMenos18anos);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+ pessoasNervosasMais40anos);
		
	}
	

}
