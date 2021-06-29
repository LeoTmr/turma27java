programa
{
	
	funcao inicio()
	{
		inteiro potuacao[5],maior=0, numPonto

		para(inteiro x=0; x<5; x++)
		{
			escreva("Digite aqui a pontuação da atividade ", (x+1), " : ")
			leia(numPonto)

			 se(numPonto > maior){
				maior=numPonto
			 	
			 }
		}	
		
		escreva("maior ponto é igual a: " +maior)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {potuacao, 6, 10, 8}-{x, 8, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */