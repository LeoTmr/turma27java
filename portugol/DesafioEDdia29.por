programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno[4]
		inteiro notaAluno[4]

		para(inteiro x=0; x<4; x++){

			escreva("Digite o nome do aluno: ")
			leia(nomeAluno[x])

			escreva("Escreva a nota do aluno: ")
			leia(notaAluno[x])

			limpa()
					}

			para(inteiro x=0; x<4; x++){
			se(notaAluno[x] <=5){
			escreva("Oi! " +nomeAluno[x] + " sua nota é: " +notaAluno[x] + "\n" +" Estude emais da proxima vez\n") 

				
			}
			senao{
				escreva("Oi! " +nomeAluno[x] + " sua nota é: " +notaAluno[x] + "\n" +"Aprovado\n")
			

			}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */