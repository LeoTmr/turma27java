package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1,nota2,nota3,soma,MP;
		
		
		System.out.println("Escreva sua primeira nota: ");
		nota1=ler.nextDouble();
		
		System.out.println("Escreva sua segunda nota: ");
		nota2=ler.nextDouble();
		
		System.out.println("Escreva sua terceira nota: ");
		nota3=ler.nextDouble();
		
		soma=(2+3+5);
		MP=((nota1*2)+(nota2*3)+(nota3*5))/soma;
		
		System.out.println("A media ponderada é igual a: "+MP);
		
		
		
		
		
		
		
		



	}

}
