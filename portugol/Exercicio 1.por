programa
{
	
	funcao inicio()
	{
		inteiro ano,mes,dias

		escreva("Bom dia, calcule sua idade em dias","\n")

		escreva("Neste campo escreva sua idade (em anos) ")

		leia(ano)

		escreva("meses baseados em um ano (em meses) ")

		leia(mes)

		escreva("dias baseados em um ano(em dias) ")
		leia(dias)

		dias=(dias+(ano*365)+(mes*30))

		escreva("Sua idade em dias é: " ,dias, "dias")


		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */