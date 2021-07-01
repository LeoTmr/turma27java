package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ano,mes,dias;
		
		System.out.println("Entre com sua idade (em anos): ");
		ano=ler.nextInt();
		
		System.out.println("Meses baseados em um ano (em meses): ");
		mes=ler.nextInt();
		
		System.out.println("Dias baseados em um ano (em dias): ");
		dias=ler.nextInt();
		
		dias=(dias+(ano*365)+(mes*30));
		
		System.out.println(dias);
		dias=ler.nextInt();
		
		

	}

}
