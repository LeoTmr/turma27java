package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num;
					
		System.out.println("Precisoque você informe um numero: ");
		num=ler.nextInt();
		
		if((num%2)==0) {
			System.out.printf("Esse numero é par e sua raiz quadrada é: %.2f\n", Math.sqrt(num));
			
		}
		else if((num%2)==1) {
			System.out.printf("Esse numero é impar e ele elevado ao quadrado é: %.2f", Math.pow(num, 2));
		}
		
		
				
	}

}
