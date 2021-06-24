programa
{
	
	funcao inicio()
	{
		inteiro D,M,DPM,IDA,IDM, idade
		 cadeia nome
		
		escreva("\n Qual é o seu nome: ")
		leia (nome)
		
	
		escreva ("Qual é sua idade (expressa em dias) : ")		
		leia(idade)

		escreva("Agora preciso que me informe quantos meses passaram desde o seu aniversario :")
		leia(M)

		escreva("Me informe quantos dias se passaram nesse mês :")
		leia(DPM)

		IDA = (idade / 365)
		IDM = (M/30 - M) * (-1)
		D =  DPM

		escreva("Obrigado pelas informações " ,nome, " voce ja viveu por " ,IDA, " anos , ", IDM, " meses e " ,D, " dias até hoje" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 544; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */