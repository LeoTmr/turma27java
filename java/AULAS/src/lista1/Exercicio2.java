package lista1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int D,M,DPM,IDA,IDM, idade;
		
		
		System.out.println("Precios que você me informe o seu nome: ");
		String nome = ler.nextLine();
		
		System.out.println("Qual é sua idade (expressa em dias) : ");
		idade=ler.nextInt();
		
		System.out.println("Agora preciso que me informe quantos meses passaram desde o seu aniversario: ");
		M=ler.nextInt();
		
		System.out.println("Me informe quantos dias se passaram nesse mês: ");
		DPM=ler.nextInt();
		
		IDA=(idade / 365);
				IDM = (M/30 - M) * (-1);
				D =  DPM;
		
		System.out.println(IDA);
		
		
		
		
		

	}

}
