package lista4;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		 float[] repeticao;
		 float maior;
		 
		 while(true) {
			 repeticao = new float [5];
			 maior = 0;
		
			 
			 for (int i=0; i<repeticao.length; i++) {
				 System.out.println("Digite o "+(i+1)+"° o valor: ");
				 repeticao[i] = new Scanner (System.in).nextFloat();
				 
				 if (repeticao[i] > maior) {
					 maior = repeticao[i];
				 }	 
			 }
		 
			 System.out.println("O maior numero é: " + maior);
			 System.out.println("");
		 }
		 
		
		
	}

}
