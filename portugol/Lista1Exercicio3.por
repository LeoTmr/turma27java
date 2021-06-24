programa
{
	
	funcao inicio()
	{
		inteiro tempoEvento
		inteiro segundos, minutos, horas

		//segundos = 1         minutos - 60 segundos        horas= 3600 segundos
		
		escreva("Preciso saber o tempo do seu evento (EM SEGUNDOS) ")
		leia (tempoEvento)

		horas = tempoEvento / 3600
		minutos = (tempoEvento % 3600) / 60
		segundos = (tempoEvento % 3600) % 60

		escreva("horas : " ,+horas,+ "\n")
		escreva("minutos : " ,+minutos,+ "\n")
		escreva("segundos : " ,+segundos,+ "\n")
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */