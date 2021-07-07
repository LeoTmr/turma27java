package Programa;

import java.util.Scanner;
import Objetos.ClasseCliente;

public class ProgramaCliente {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		ClasseCliente cliente1 = new ClasseCliente();
		
		System.out.println("Ola, insira seu nome porfavor: ");
		cliente1.nomeCompleto = leia.next();
		
		System.out.println("Insira sua matricula: ");
		cliente1.matricula = leia.next();
		
		System.out.println("Insira seu aniversario: ");
		cliente1.aniversario = leia.next();
				
			System.out.println(cliente1.saudacao(cliente1.nomeCompleto, cliente1.matricula));
			System.out.println(cliente1.promocao(cliente1.aniversario));
	}
}
