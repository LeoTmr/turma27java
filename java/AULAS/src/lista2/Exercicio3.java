package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Preciso que voc� me informe sua idade: ");
			idade=ler.nextInt();
					
		if(idade<=14) {
			System.out.println("Voc� est� n� categoria infantil");
			
		}
		
		else if(idade<=17) {
			System.out.println("Voc� est� na categoria juvenil");
			
		}
		else {
			System.out.println("Voc� est� na categoria adulto");
		}
		
		
		
		
	}

}
