package lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int idade=0, totalMenor21=0, totalMenor50=0;
	
		while(idade <=-99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
		if(idade < 21){
			totalMenor21 = totalMenor21 + 1;
		}
		if(idade > 50){
			totalMenor50 = totalMenor50 + 1;	
			
		}
		
		System.out.println("Total de idade menores que 21 é: %d" + totalMenor21);
		System.out.println("Total de idade maiores que 50 é: %d" + totalMenor50);
		}
	}

}
