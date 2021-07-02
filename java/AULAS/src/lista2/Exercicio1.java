package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1,numero2,numero3;
		
		System.out.println("Digite nesse campo o seu primeiro numero: ");
		numero1=ler.nextInt();
		
		System.out.println("Digite nesse campo o seu segundo numero: ");
		numero2=ler.nextInt();
		
		System.out.println("Digite nesse campo o seu terceiro numero: ");
		numero3=ler.nextInt();
			
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior numero Digitado foi: "+numero1);
		}
		else if (numero2 > numero1 && numero2 > numero3) {
		
			System.out.println("O maior numero Digitado foi: "+numero2);
		}
		
		else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior numero Digitado foi: "+numero3);
			
		}
	
	
	
	}
	
	
	

}
