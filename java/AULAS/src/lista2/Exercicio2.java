package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int num1,num2,num3,C;

		System.out.println("Escreva seu primeiro numero: ");
		num1=ler.nextInt();
		
		System.out.println("Escreva seu segundo numero: ");
		num2=ler.nextInt();
		
		System.out.println("Escreva seu terceiro numero: ");
		num3=ler.nextInt();
		
		do{
			if(num1 > num3) {
			C=num1;
			num1=num3;
			num3=C;
				
			}
			if(num1 > num2) {
				C=num1;
				num1=num2;
				num2=C;
					
			}
			if(num2 > num3) {
				C=num2;
				num2=num3;
				num3=C;
					
			}
			
			}while(num1 > num3 || num1 > num2 || num2 > num3);
			System.out.println(num1+" "+num2+" "+num3);
		
	
	
	}
}


