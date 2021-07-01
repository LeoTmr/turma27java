package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double A,B,C,S,R,D;
		
		System.out.println("Preciso que você me informe o seu A: ");
		A=ler.nextInt();
		
		System.out.println("Preciso que você me informe o seu B: ");
		B=ler.nextInt();
				
		System.out.println("Preciso que você me informe o seu C: ");
		C=ler.nextInt();
		
		R=Math.pow((A+B),2);
		S=Math.pow((B+C),2);
		
		D= ((R+S)/2);
		
		System.out.println("A sua distancia é: "+D);
		
		
		

	}

}
