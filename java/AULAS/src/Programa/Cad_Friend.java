package Programa;

import java.util.Scanner;

import Objetos.Pessoas;

public class Cad_Friend {

	public static void main(String[] args) {
		        Scanner leia = new Scanner(System.in);

		        Pessoas amigo1 = new Pessoas(); //instanciei o objeto importando
		        Pessoas amigo2 = new Pessoas();
		        Pessoas amigo3 = new Pessoas();

		        System.out.println("Digite o nome: ");
		        amigo1.nome = leia.next().toUpperCase();


		        System.out.println("Digite o ano de nascimento: ");
		        amigo1.anoNascimento = leia.nextInt();


		        System.out.println("Digite o nome 2: ");
		        amigo2.nome = leia.next().toUpperCase();
		        amigo2.anoNascimento = 2012;

		        System.out.printf("Meus amigos s�o %s e %s", amigo1.nome, amigo2.nome);

		        if((amigo1.calcularIdade(2021))>(amigo2.calcularIdade(2021))) {
		            System.out.printf("\n%s � mais velho(a) que %s\n", amigo1.nome, amigo2.nome);
		            amigo1.mostrarIdade();//chamei um m�todo
		        } else if ((amigo1.calcularIdade(2021))<(amigo2.calcularIdade(2021))) {
		            System.out.printf("\n%s � mais velho que %s\n", amigo2.nome, amigo1.nome);
		            amigo2.mostrarIdade();
		        } else {
		            System.out.printf("\n%s tem a mesma idade que %s", amigo1.nome, amigo2.nome);
		        }


		    }

		}