package DesafioEd;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int numero;
		
		System.out.println("Digite um valor inteiro");
		numero=ler.nextInt();
				
		if(numero < 0) {
			
			System.out.println("Infelizmente o sistema s� l� nmero positivo, n�o negativo");
		}
		
		
		if(numero%2==1) {
				
		System.out.println("o numero "+ numero +" � impar \n");
				
		}if (numero==0) {
			
			System.out.println(numero +" � neutro");
		}
		
		else if(numero%2==0) 
			{
				
				System.out.println("o numero "+numero+" � par \n");
			}
		
			
			
			
			
				
				
				
			}
			
			
	}


