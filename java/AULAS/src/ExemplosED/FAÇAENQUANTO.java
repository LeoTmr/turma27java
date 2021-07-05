package ExemplosED;

import java.util.Scanner;

public class FAÇAENQUANTO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		int x=2;
		int aux=1;
		System.out.println("Digite um numero positivo: ");
		numero= ler.nextInt();
		
		if(numero <= 0) { 
			System.out.println("Numero invalido!");
		}
		else 
		{
			
		}
		do 
		{
			System.out.printf("%d + %d = %d",aux,x);
			
		}while(x<= numero);{
			
		}
		
	}

}
