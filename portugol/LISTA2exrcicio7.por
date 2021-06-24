programa
{
	
	funcao inicio()
	{
		inteiro base, altura, alturaV

		escreva("Preciso que voce me informa a Base do seu triangulo: ")
		leia (base)
		escreva("Preciso que você me informa qual e Altura do seu triangulo: ")
		leia (altura)

		alturaV = (base * altura) / 2

		se (alturaV>0) {

		escreva("Está é a area do seu triangulo: "+alturaV)
		} 
		senao {

			escreva("Você não informou numeros maiores que 0")
		}

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */