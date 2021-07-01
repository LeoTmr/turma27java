package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int tempoEvento, segundos, minutos, horas;
		
		
		
		System.out.println("Preciso saber o tempo do seu evento (EM SEGUNDOS): ");
		tempoEvento=ler.nextInt();
		
		horas = tempoEvento / 3600;
				minutos = (tempoEvento % 3600) / 60;
				segundos = (tempoEvento % 3600) % 60;
		
				System.out.println("Horas: "+horas);
				System.out.println("Minutos: "+minutos);
				System.out.println("segundos: "+segundos);
		
		

	}

}
